package recursion;

import java.io.*;

public class Hannnoi_6 {
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());

        //옮긴 횟수
        bw.write((int)(Math.pow(2,num)-1)+"\n");

        HannoiMaking(num,1,2,3);

        bw.flush();
        bw.close();




    }
    public static void HannoiMaking(int num, int start, int mid, int end) throws IOException {

        //원판 1개만 이동해야 하는 경우
        if (num==1){
            bw.write(start+" "+end+"\n");
            return;
        }

        //A->C
        HannoiMaking(num-1, start,end,mid);

        //남은 1개를 A에서 C로 이동
        bw.write(start+" "+end+"\n");

        //남은 N-1개를 다시 B->C로 이동
        HannoiMaking(num-1,mid,start,end);


    }
}
