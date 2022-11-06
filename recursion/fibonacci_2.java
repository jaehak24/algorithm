package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());
        System.out.println(fibona(num));


    }

    public static int fibona(int num){
        if(num==0) return 0;
        if (num==1) return 1;
        if (num==2) return 1;
        int result=fibona(num-1)+fibona(num-2);
        return result;
    }
}
