package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MinSumDecimal {


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int min=Integer.parseInt(br.readLine());//최소 리밋
        int max=Integer.parseInt(br.readLine());//최대 리밋


        int minDecimal=max;
        int sum=0;

        for(int i=min;i<=max;i++){


            boolean Prime=true;
            if(i==2) continue;
            for(int j=2;j<i;j++){

                if(i%j==0||i==2){
                    Prime=false;
                    break;
                }

            }
            if(Prime){
                if (i<minDecimal) minDecimal=i;
                System.out.println("소수: "+i);
                sum+=i;
            }
        }
        if(sum==0)System.out.println(-1);
        else System.out.print(sum+"\n"+minDecimal);


    }
}
