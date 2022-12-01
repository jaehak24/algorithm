package BaekJoon.BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class count_receiver {

    public static int MAX=Integer.MAX_VALUE;
    public static int MIN=Integer.MIN_VALUE;
    public static int[] operator=new int[4];//연산자
    public static int[] number;
    public static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        N=Integer.parseInt(br.readLine());

        number=new int[N];

        //숫자
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<N;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }

        //연산자
        st=new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<4;i++){
            operator[i]=Integer.parseInt(st.nextToken());
        }


        dfs(number[0],1);
        System.out.println(MAX+"\n"+MIN);

    }

    public static void dfs(int num, int index){

        if(index==N){
            MAX=Math.max(MAX,num);
            MIN=Math.min(MIN,num);
            return;
        }
        for (int i=0; i<4;i++){
            //연산자 개수가 1개 이상일 때
            if(operator[i]>0){
                operator[i]--;

                if(i==0) dfs(num+number[index],index+1);
                else if(i==1) dfs(num-number[index],index+1);
                else if(i==2) dfs(num*number[index],index+1);
                else if(i==3) dfs(num/number[index],index+1);

            }

            operator[i]++;
        }
    }


}
