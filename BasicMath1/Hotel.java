package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int Test=Integer.parseInt(br.readLine());

        while(Test>0){
            String[] arr=br.readLine().split(" ");
            int h=Integer.parseInt(arr[0]);
            int w=Integer.parseInt(arr[1]);
            int n=Integer.parseInt(arr[2]);

            int n1=n%h;
            int n2=n/h+1;
            //나머지가 없을 때 에외가 생김
            if(n1==0){
                n1=h;
                n2-=1;
            }

            System.out.println(n1*100+n2);


            Test--;
        }
        br.close();
    }
}
