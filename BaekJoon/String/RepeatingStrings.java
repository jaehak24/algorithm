package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatingStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //문자열 횟수 입력
        int lines=Integer.parseInt(br.readLine());

        for (int i=0; i<lines;i++){

            String[] str=br.readLine().split(" ");
            int Repeat=Integer.parseInt(str[0]); //반복 횏수
            String S=str[1];

            for (int j=0;j< str.length;j++){
                for (int k=0;k<Repeat;k++){
                    System.out.print(S.charAt(k));
                }
            }
            System.out.println();
        }

    }
}
