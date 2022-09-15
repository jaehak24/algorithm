import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*주사위 세개
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B= sc.nextInt();
        int C=sc.nextInt();
        //3페어일 경우
        if(A==B&&B==C) System.out.println(10000+1000*A);
        else if (A==B&&B!=C) System.out.println(1000+100*A);
        else if (A==C&&A!=B) System.out.println(1000+100*C);
        else if (B==C&&A!=C) System.out.println(1000+100*B);
        else {
            int Max=A;
            if(B>Max) Max=B;
            if(C>Max) Max=C;
            System.out.println(Max*100);
        }

        }

         */

        /*오븐 시계
        Scanner sc=new Scanner(System.in);
        int hour= sc.nextInt();
        int minute= sc.nextInt();
        int addM=sc.nextInt();

        int min=60*hour+minute;
        min+=addM;

        int hourR=(min/60)%24;
        int minR=min%60;
        System.out.println(hourR+" "+minR);

         */




        /*시계
        Scanner sc=new Scanner(System.in);
        int hour= sc.nextInt();
        int minute= sc.nextInt();

        sc.close();

        if (minute<45) {
            if (hour==0)System.out.printf("23 %d",(minute+15) );
            else System.out.printf("%d %d",(hour-1),(minute+15));

        }
        else System.out.println(hour+" "+(minute-45) );

         */


        //4분면 고르기

        //윤년 !100의 배수&&4의배수=? 윤년
        /*
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int year=Integer.valueOf(br.readLine());
        if(year%4==0&&year%100!=0) bw.write("1");
        else if(year%400==0) bw.write("1");
        else bw.write("0");
        bw.flush();

         */

        //크기 비교
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//입력 스트림
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));//출력 스트림
        String[] numbers= br.readLine().split(" ");
        int num1=Integer.valueOf(numbers[0]);
        int num2=Integer.valueOf(numbers[1]);

        if(num1<num2) bw.write("<");
        else if(num1>num2) bw.write(">");
        else bw.write("==");
        bw.flush();*/
        /*점수 비교

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int scores=Integer.valueOf(br.readLine());
        //0보다 크거나 같고 100보다 작거나 같은 저웃
        if(scores<=100&&scores>=90) bw.write("A");
        else if (scores<90&&scores>=80) bw.write("B");
        else if (scores<80&&scores>=70) bw.write("C");
        else if (scores<70&&scores>=60) bw.write("D");
        else bw.write("F");
        bw.flush();
         */


    }
}
