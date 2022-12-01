package BaekJoon.array;

import java.io.*;

public class Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[]=new int[9];
        int max=0;
        int index=0;
        for (int i=0;i<9;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]>max) {
                max=arr[i];
                index=i+1;
            }
        }
        bw.write(max+"\n"+index);
        bw.flush();
        br.close();
        bw.close();
    }
}
