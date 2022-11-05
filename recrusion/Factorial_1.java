package recrusion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());

        System.out.println(factorial(num));



    }

    public static int factorial(int num){


        int result=num;
        if(result==1)return 1;
        if(result==0) return 1;
        result*=factorial(num-1);

        return result;

    }
}
