package BaekJoon.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1712
public class BreakEvenPoint {
    public static void main(String[] args) throws IOException {
        //A 고정 비용
        //B 가변 비용
        //C 가격
        //A+BX<=CX가 되는 X 를 구해라
        //A<=X(C-B)

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] arr=br.readLine().split(" ");
        int A=Integer.parseInt(arr[0]);
        int B=Integer.parseInt(arr[1]);
        int C=Integer.parseInt(arr[2]);


        if(C <= B) System.out.println(-1);
        else System.out.println(A/(C-B)+1);


    }
}
