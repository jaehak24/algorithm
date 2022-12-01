package BaekJoon.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBath {
    public static boolean Prime[];
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Prime=new boolean[10001];
        get_prime();
        int num=Integer.parseInt(br.readLine());

        while (num-- >0){
            int n=Integer.parseInt(br.readLine());


            //수의 중간 값을 기준으로 소수가 있음
            int prime1=n/2;
            int prime2=n/2;

            while(true){
                if(!Prime[prime1]&&!Prime[prime2]){
                    System.out.println(prime1+" "+prime2);
                    break;
                }
                prime1--;
                prime2++;

            }
        }



    }
    public static void get_prime() {

        //true 소수
        //false 소수 아님
        Prime[0]=Prime[1]=true;

        for (int i=2;i<Math.sqrt(Prime.length);i++){
            if(Prime[i]) continue;
            for (int j=i*i;j<Prime.length;j+=i){
                Prime[j]=true;
            }

        }
    }
}
