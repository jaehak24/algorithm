package recursion;

import java.io.*;

public class Star_5 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());


        //1 1 빈 공백
        //작 작 큰 공백
        arr=new char[num][num];

        star(0,0,num,false);
        for (int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();


    }

    public static void star(int x, int y, int N, boolean blank){
        //3x3 이 전부 빈 경우
        if(blank){
            for (int i=x; i<x+N;i++){
                for (int j=y; j<y+N;j++){
                    arr[i][j]=' ';
                }
            }
            return;
        }

        if(N==1){
            arr[x][y]='*';
            return;
        }

        int size=N/3;
        int count=0;
        for (int i=x;i<x+N;i+=size){
            for (int j=y;j<y+N;j+=size){
                count++;
                if(count==5){//--> 공백 칸
                    star(i,j,size,true);
                }
                else{
                    star(i,j,size,false);
                }
            }
        }

    }
}
