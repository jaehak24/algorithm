package BaekJoon.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriealNumber1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //한계점 입력
        int num=Integer.parseInt(br.readLine());

        //1~2자리수를 입력받았을 경우
        if(num<100)
            System.out.println(num);
        else {
            boolean[] SerialArr=new boolean[num-99];
            int cnt=99;
            for (int i=100;i<num+1;i++){
                if(SerialNum(i)) cnt++;
            }
            System.out.println(cnt);
        }


    }
    public static boolean SerialNum(int num){
        int[] digit=new int[3];
        if((num/100-(num%100)/10)==((num%100)/10-num%10)) return true;
        else return false;
    }
}
