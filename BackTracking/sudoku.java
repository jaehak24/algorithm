package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sudoku {


    public static int[][] arr=new int[9][9];


    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //수도쿠 입력문
        for (int i=0;i<9;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            //arr에 입력
            for (int j=0;j<9;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        sudoku(0,0);


    }

    public static void sudoku(int row, int column){

        //모든 행이 다 채워졋을 경우
        if(column==9){
            //다음 열로 이동
            sudoku(row+1,0);
            return;
        }

        //행을 채우고 열을 이동하는 방식ㄱ
        //모든 값이 채워졌을 경ㅜ
        if(row==9){
            //다음 행으로 이동
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<9;i++){
                for (int j=0;j<9;j++){
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);//exit을 통해서 재귀문 탈출

        }


        //0을 만낫을 경우
        if(arr[row][column]==0){
            for(int i=0;i<=9;i++){
                if(FitsTheRow(row,column,i)){
                    //값 입력
                    arr[row][column]=i;
                    sudoku(row,column+1);
                }

            }

            arr[row][column]=0;
            return;

        }

        sudoku(row,column+1);

    }

    public static boolean FitsTheRow(int row, int column,int value){
        //같은 행에 잇는 원소 중복 여부 판별
        for (int i=0;i<9;i++){
            if (arr[row][i]==value){
                return false;
            }
        }

        //같은 열에 있는 원소 중복 여부 판별
        for (int i=0;i<9;i++){
            if(arr[i][column]==value){
                return false;
            }
        }

        //좌표가 속한 박스에 중복되는 원소가 있는지 판별
        int set_row=(row/3)*3; //value가 속한 3x3의 행의 첫번째 좌표값
        int set_col=(row/3)*3; //value가 속한 3x3의 행의 첫번쨰 좌표값


        for (int i=set_row;i<set_row+3;i++){
            for (int j=set_col;j<set_col+3;j++){
                if(arr[i][j]==value) return false;
            }
        }

        return true;
    }
}
