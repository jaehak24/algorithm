package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dynamic_recursive_2 {

    static int dp[][][]=new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        while (true){


            StringTokenizer st=new StringTokenizer(br.readLine()," ");

            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            int num3=Integer.parseInt(st.nextToken());

            if(num1==-1&&num2==-1&&num3==-1) break;

            sb.append("w(" + num1 + ", " + num2 + ", " + num3 + ") = ").append(W(num1 ,num2 ,num3)).append('\n');


        }
        System.out.println(sb);

    }

    public static int W(int a, int b, int c){


        //범위를 벗어나지 않게 하기위해
        if(IsinRange(a,b,c)&&dp[a][b][c]!=0) return dp[a][b][c];


        if(a<=0||b<=0||c<=0) {return 1;}
        else if(a>20||b>20||c>20) {return dp[20][20][20]=W(20,20,20);}
        else if(a<b&&b<c) return dp[a][b][c]=W(a,b,c-1)+W(a,b-1,c-1)-W(a,b-1,c);
        else {
            dp[a][b][c]=W(a-1,b,c)+W(a-1,b-1,c)+W(a-1,b,c-1)-W(a-1,b-1,c-1);
            return dp[a][b][c];}
    }

    public static boolean IsinRange(int a, int b, int c){
        return (0<=a&&a<=20)&&(0<=b&&b<=20)&&(c<=20&&c>=0);
    }
}
