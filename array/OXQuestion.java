package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class OXQuestion {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //입력 문자열
        int num=Integer.parseInt(br.readLine());

        //각 문자열을 저장할 배열
        String[] arr=new String[num];
        //각 점수를 저장할 배열
        int[] Scores=new int[num];
        int index=0;
        while(index<num){
            arr[index]=br.readLine();
            Scores[index]=Score(arr[index]);
            index++;
        }
        for(int i=0;i<num-1;i++){
            System.out.print(Scores[i]+"\n");
        }
        System.out.print(Scores[num-1]);

        br.close();


    }

    public static int Score(String str){
        int score=0;

        StringTokenizer tokens=new StringTokenizer(str,"X");
        String[] arr=new String[tokens.countTokens()];
        int index=0;
        while(tokens.hasMoreTokens()){
            arr[index]=tokens.nextToken();
            for (int i=1;i<=arr[index].length();i++){
                score+=i;
            }
        }

        return score;

    }
}
