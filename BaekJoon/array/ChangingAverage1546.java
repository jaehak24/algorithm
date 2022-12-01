package BaekJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangingAverage1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //횟수 입력
        int num= Integer.parseInt(br.readLine());

        //점수 입력 후 배열에 저장
        String str="";
        StringTokenizer tokens=new StringTokenizer(br.readLine()," ");

        int index=0;
        int[] arr=new int[num];
        int max=0;
        while(tokens.hasMoreTokens()){
            arr[index]=Integer.parseInt(tokens.nextToken());
            if(max<arr[index]) max=arr[index];
            index++;
        }
        double[] arr2=new double[arr.length];
        double sum=0;
        for (int i=0;i< arr.length;i++){
            arr2[i]=(double) arr[i]/(double)max*100;
            sum+=arr2[i];
        }
        System.out.println(sum/ arr2.length);


    }
}
