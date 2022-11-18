package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dynamic_recursive_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());

        int num1=Integer.parseInt(st.nextToken());
        int num2=Integer.parseInt(st.nextToken());
        int num3=Integer.parseInt(st.nextToken());

    }

    public static int W(int a, int b, int c){

        if(a<=0||b<=0||c<=0) return 1;
        else if(a>20||b>20||c>20) return W(20,20,20);
        else if(a<b&&b<c) return W(a,b,c-1)+W(a,b-1,c-1)-W(a,b-1,c);
        else return W(a-1,b,c)+W(a-1,b-1,c)+W(a-1,b,c-1)-W(a-1,b-1,c-1);
    }
}
