package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class knights_weapon {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        //number limit power 입력 예정
        int num=Integer.parseInt(st.nextToken());
        int limit=Integer.parseInt(st.nextToken());
        int power=Integer.parseInt(st.nextToken());
        System.out.println(solution(num,limit,power));



    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<=number;i++){
            int count=getNum(i);

            if(count<=limit) answer+=count;
            else answer+=power;
        }
        return answer;
    }

    static int getNum(int num){

        int cnt=0;
        for (int i=1; i*i<=num;i++){
            if(num%i==0) {
                cnt++;
                if(i*i<num) cnt++;
            }
        }
        return cnt;
    }
}
