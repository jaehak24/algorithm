package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class StairCase {

    final static int decimal=1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());


        long[][] dp=new long[N+1][10];

        //첫 번쨰 자리의 수는 모든 경우의 수가 올 수 있음

        //-->즉 1~9;
        for (int i=1;i<10;i++){
            dp[1][i]=1; //
        }

        //2번쨰 자리부터
        for (int i=2; i<=N;i++){
            for (int j=0;j<10;j++){
                //자리 값이 0이라면 이전 자릿수의 첫번째 자릿수만 가능
                if(j==0) dp[i][0]=dp[i-1][1]%decimal;
                //자리 값이 9면 자릿수는 8만 가능
                else if(j==9) dp[i][9]=dp[i-1][8]%decimal;

                else
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j+1]%decimal;
            }
        }
        long result=0;

        for (int i=0;i<10;i++){
            result+=dp[N][i];
        }

        System.out.println(result%decimal);






    }


}
