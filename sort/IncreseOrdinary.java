package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreseOrdinary {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int[] arr=new int[num];
        while (num-- >0){
            arr[num]=Integer.parseInt(br.readLine());
        }


    }
}
