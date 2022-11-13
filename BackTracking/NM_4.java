package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM_4 {


    //비내림 차순

    public static int[] arr;

    public static int N,M;

    public static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sT=new StringTokenizer(br.readLine());

        N=Integer.parseInt(sT.nextToken());

        M=Integer.parseInt(sT.nextToken());

        arr=new int[M];


        //정렬을 해야하므로 인수가 하나 더 추가
        dfs(1, 0);

        System.out.println(sb);


    }

    public static void dfs(int at, int depth){
        if(depth==M){
            for (int val:arr){
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return; //재귀함수 분할점 종결
        }

        for (int i=at;i<=N;i++){
            arr[depth]=i;
            dfs(i,depth+1);
        }
    }
}
