package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vetrdang {
    public static boolean Prime[];
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int num=Integer.parseInt(br.readLine());
            int count=0;
            Prime=new boolean[2*num+2];
            get_prime();

            for (int i=num;i<2*num+1;i++){
                if(!Prime[i]) count++;

            }
            System.out.println(count);



            if(num==0) break;

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
