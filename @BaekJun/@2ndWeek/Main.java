import java.io.*;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//입력 스트림
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));//출력 스트림
        String[] numbers= br.readLine().split(" ");
        int num1=Integer.valueOf(numbers[0]);
        int num2=Integer.valueOf(numbers[1]);

        if(num1<num2) bw.write("<");
        else if(num1>num2) bw.write(">");
        else bw.write("==");
        bw.flush();



    }
}


