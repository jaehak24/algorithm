package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalsOfNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int num=Integer.parseInt(br.readLine());

        for (int i=2;i<=Math.sqrt(num);i++){
            while(num%i==0){
                sb.append(i);
                sb.append("\n");
                num/=i;
            }
        }

        if(num!=1){
            sb.append(num);
        }

        System.out.println(sb);


    }
}
