package BaekJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[] arr;

        //횟수 입력
        int num=Integer.parseInt(br.readLine());
        StringTokenizer Token;

        for (int i=0;i<num;i++){
            //성정 입력 배분
            Token=new StringTokenizer(br.readLine(), " ");

            //학생 수
            int students=Integer.parseInt(Token.nextToken());
            //학생들의 성적으로 배열 생성
            arr=new int[students];//

            //성적 합
            double sum=0;

            //성적 입력
            for(int j=0;j<students;j++){
                int score=Integer.parseInt(Token.nextToken()); //성적 변수에 저장
                arr[j]=score;
                sum+=score;
            }

            double Avg=sum/students;
            double StudentOberAvg=0;

            for(int j=0; j<students;j++){
                if(arr[j]>Avg)StudentOberAvg++;
            }
            System.out.printf("%.3f%%\n",(StudentOberAvg/students)*100);
        }



    }
}
