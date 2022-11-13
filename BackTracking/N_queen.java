package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_queen {


    //각 열의 퀸의 위치
    public static int[] arr;

    public static int N; //행의 개수
    public static int count=0;


    public static void main(String[] args) throws IOException {
        //1일 경우 0개
        //2일 경우 0개
        //3일 경우 0개
        //4일 경우
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());

        arr=new int[N];

        n_queen(0);

        System.out.println(count);

    }

    public static void n_queen(int depth){

        //모든 퀸을 다 채웠을 때
        if(depth==N){
            count++;
            return;
        }

        for (int i=0;i<N;i++){
            arr[depth]=i;
            if(possibility(depth)){
                //조건을 충족햇을 경우 다음 레벨의 tree로 넘어가서 확인
                n_queen(depth+1);
            }
        }
    }

    public static boolean possibility(int column){
        for(int i=0;i<column;i++){
            //현재 행의 위치에 퀸과 행의 위치가 일치할 경우
            if(arr[column]==arr[i])
                return false;
            //대각선상에 놓일 경우-->열의 차와 행의 차가 같다.
            else if(Math.abs(column-i)==Math.abs(arr[column]-arr[i])){
                return false;
            }

        }
        return true;
    }
}
