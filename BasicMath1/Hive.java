package BasicMath1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2292번 문제
public class Hive {
    public static void main(String[] args) throws IOException {
        //1
        //2~7 6개
        //8~19 12개
        //20~37 18개
        //1+6k 의 등차수열
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());

        //3n^2+3n+1
        int count=0;
        if(num==1) System.out.println(1);
        else {
            while (3*Math.pow(count,2)+3*count+1<num){
                count++;
            }
            System.out.println(count+1);
        }



    }
}
