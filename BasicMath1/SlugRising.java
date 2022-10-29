package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SlugRising {
    public static void main(String[] args) throws IOException {
        // 낮 A 만큼 상승
        //밤 B만큼 하강
        //V 거리
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] arr=br.readLine().split(" ");
        int A=Integer.parseInt(arr[0]);
        int B=Integer.parseInt(arr[1]);
        int V=Integer.parseInt(arr[2]);

        int day=(V-B)/(A-B);

        if((V-B)%(A-B) !=0) day++;
        System.out.println(day);

    }
}
