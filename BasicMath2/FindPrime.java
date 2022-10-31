package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrime {
    public static boolean[] Prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb=new StringTokenizer(br.readLine()," ");
        int M=Integer.parseInt(sb.nextToken());
        int N=Integer.parseInt(sb.nextToken());

        //N보다 작은 모든 소수들을 구함
        Prime=new boolean[N+1];
        get_prime();


        for (int i=M;i<N;i++){
            if(!Prime[i]) System.out.println(i);

        }

    }

    //
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
