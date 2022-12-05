package BaekJoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tile_3 {
    public static void main(String[] args) throws IOException {

        //1은 1개만 사용가능
        //0은 1쌍으로만 들어와야 함

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //자릿수
        int digit=Integer.parseInt(br.readLine());

        //자릿수를 쌍우로 나눌 수 있는 수
        System.out.println(SetTile(digit));



    }

    public static int SetTile(int num){
        if(num==1) return 1;
        if(num==2) return 2;

        int val1=1;
        int val2=2;
        int sum=0;
        for (int i=2;i<num;i++){
            sum=(val1+val2)%15746;
            val1=val2;
            val2=sum;
        }
        return sum;
    }
}
