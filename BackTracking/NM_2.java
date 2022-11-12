package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NM_2 {
    //자연수 N과 M이 주어졌ㅇㄹ ㄸ ㅐ아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오
    //1. 1부터 N까지의 자연수 중에서 중복 없이 M개를 고른 수열
    //2. 고른 수열은 오름차순이어야 한다.

    public static int[] arr;


    public static int N,M;
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sT=new StringTokenizer(br.readLine());

        N=Integer.parseInt(sT.nextToken());

        M=Integer.parseInt(sT.nextToken());

        //배열의 사이즈 설정
        arr=new int[M];


        //깊이가 m인 tree 작성
        dfs(1,0);

        System.out.println(sb);




    }

    public static void dfs(int at, int depth){

        //오름차순으로 정렬
        Arrays.stream(arr).sorted();

        if(depth==M){
            for (int val:arr){
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return;
        }


        for(int i=at;i<=N;i++){
            arr[depth]=i;
            //방문했으므로 깊이 1 추가

            //재귀문을 통해 마지막숫자까지 출력
            dfs(i+1,depth+1);


        }
    }
}
