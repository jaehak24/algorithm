package BaekJoon.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] num=br.readLine().split(" ");

        //Java에서는 Long long이 없는 듯
        //문자열로 변경 후 계산을 출력
        String num1=num[0];
        String num2=num[1];
        int num1Len=num1.length();
        int num2Len=num2.length();
        int MaxLen=Math.max(num1Len,num2Len);


        int[] num1A=new int[MaxLen+1];//넘어갈 수 때문에
        for (int i=MaxLen-1,idx=0;i>=0;i--,idx++){
            num1A[idx]=num1.charAt(i)-'0';

        }



        int[] num2A=new int[MaxLen+1];
        for (int i=MaxLen-1,idx=0;i>=0;i--,idx++){
            num2A[idx]=num2.charAt(i)-'0';

        }
        for (int i=0;i<MaxLen;i++){
            int value=num1A[i]+num2A[i];
            num1A[i]=value%10;
            num1A[i+1]+=value/10;
        }
        StringBuilder sb=new StringBuilder();

        for (int i=MaxLen-1;i>=0;i--){
            sb.append(num1A[i]);
        }
        System.out.println(sb);




    }
}
