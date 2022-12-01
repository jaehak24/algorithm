package BaekJoon.BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM_3 {

    //중복이 허용되는 순열

    public static int N,M;

    public static int[] arr;

    public static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        //N M 입력문
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        arr=new int[M];
        dfs(0);


        System.out.println(sb);

    }

    public static void dfs(int depth){

        //최하단 자식 노드 도달 시
        if(depth==M){
            for (int val:arr){
                //저장해 놓은 배열에 잇는 무자열을 추가
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return;
        }

        for (int i=1;i<=N;i++){
            arr[depth]=i;
            //i이므로 중복이 허용 되는 dfs가 됨
            dfs(depth+1);
        }

    }
}
