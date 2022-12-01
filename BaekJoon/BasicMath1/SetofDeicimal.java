package BaekJoon.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetofDeicimal {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());

        //등차술열의 합이 배열

        //분모
        int decimal=1;

        while((Math.pow(decimal,2)+decimal)/2<num){
            decimal++;
        }
        int value=num-(int)((Math.pow(decimal-1,2)+decimal-1)/2);
        if(decimal%2==0){
            System.out.println(String.format("%d/%d",value,(decimal+1-value)));
        }
        else System.out.println(String.format("%d/%d",(decimal+1-value),value));

    }
}
