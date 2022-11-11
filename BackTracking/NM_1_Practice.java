package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM_1_Practice {

    //N M을 입력받아 N개의 수 중 M 개의 중복 없는 수 나열

    //수를 나열하기 위한 동적 배열
    public static int[] arr;

    //arr의 모집합, boolean으로 중복 체크
    public static boolean[] visit;

    public static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stoken=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(stoken.nextToken());
        int M=Integer.parseInt(stoken.nextToken());

        // 동적 배열 크기 조정
        arr=new int[M];
        visit=new boolean[N];

        dfs(N,M,0);

        System.out.println(sb);
    }

    /*
    * ex>4개의 수를 6에서 뽑는 과정
    *           root 1
    * visited  f     2
    * visited  f     3
    * visited  t     5
    *
    *
    *
    * */



    private static void dfs(int n, int m, int depth) {

        //m 깊이의 트리 도달
        if(depth==m){
            for(int val:arr){ //종점에 도달시 arr에 있는 모든 수를 append
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return;
        }

        for (int i=0;i<n;i++){
            if (!visit[i]){
                //방문을 했으므로 true
                visit[i]=true;
                //중복 검사를 했으므로 다음 자릿수로 넘어감
                arr[depth]=i+1;//깊이 중가
                //true가 되어서 깊이가 1 증가된 dfs 출력문 메소드로 넘어간다.
                dfs(n,m,depth+1);
                //밑의 노드의 경우의 수를 해결하고 나서는 다른 수를 넣어서 해야 하기 때문에
                //방문한 노드를 다시 false로 놓는다.
                visit[i]=false;


            }
        }


    }


}
