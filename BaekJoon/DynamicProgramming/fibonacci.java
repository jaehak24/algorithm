package BaekJoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());
        System.out.println(fib(num)+" "+Dynamic_fib(num));

    }


    public static int fib(int num){
        int result=0;
        if(num==1||num==2) return 1;
        else return fib(num-1)+fib(num-2);

    }

    public static int Dynamic_fib(int num){
        int[] fib=new int[num];
        int count=0;
        fib[0]=fib[1]=1;
        for (int i=2;i<num;i++){
            fib[i]=fib[i-1]+fib[i-2];
            count++;
        }
        return count;
    }

}
