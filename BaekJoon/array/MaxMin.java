package BaekJoon.array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxMin {
    //최소 최대 문제
    public static void main(String[] args) throws IOException {
        //입력 스트림
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //숫자 개수 입력
        int num=Integer.parseInt(br.readLine());
        //자르는 기준 문자의 집합
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        int index=0;
        int[] arr=new int[num];
        while (st.hasMoreTokens()){
            arr[index]=Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);//sort를 통해 오름차순으로 정리
        bw.write(arr[0]+" "+arr[num-1]);

        bw.flush();
        br.close();
        bw.close();


    }
}
