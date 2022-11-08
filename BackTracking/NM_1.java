package BackTracking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM_1 {

    public static int[] arr;
    public static boolean[] visited;
    public static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken()); //N개의 경우의 수중
        int M=Integer.parseInt(st.nextToken()); //M개를 골라 경우의 다른 수로 나열

        arr=new int[M];
        visited=new boolean[N]; // 방문햇는지 판별하기 위한 배열
        dfs(N,M,0);

        System.out.println(sb);


    }

    public static void dfs(int N, int M, int depth){

        if(depth==M){ //종착정 도달
            for (int val:arr){
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<N;i++){
            if (!visited[i]){
                visited[i]=true;
                arr[depth]=i+1;//깊이 증가
                dfs(N,M,depth+1);
                visited[i]=false;
            }
        }
    }
}
