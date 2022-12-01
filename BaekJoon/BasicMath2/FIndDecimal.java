package BaekJoon.BasicMath2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIndDecimal {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int cnt=Integer.parseInt(br.readLine());
        int result=0;
        String[] num=br.readLine().split(" ");
        for (int i=0;i<num.length;i++){

            boolean Prime=true;
            int number=Integer.parseInt(num[i]);
            if(number==1)continue;

            for(int j=2;j < number;j++){
                if(number%j==0) {

                    Prime=false;
                    break;
                }
            }
            if(Prime){
                result++;
            }
        }
        System.out.println(result);


    }
}
