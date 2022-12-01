package BaekJoon.String;

import java.util.Scanner;

public class FIndAlphabet {
    public static void main(String[] args) {
        //방법 1
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[26];//믄자열 받을 배열 선언

        for (int i=0;i<arr.length;i++){
            arr[i]=-1;//모든 배열을 -1로 초기화
        }
        String S=sc.nextLine();
        for (int i=0;i<S.length();i++){
            char ch=S.charAt(i);

            //만약 선택한 문자가 -1이면
            if(arr[ch-'a']==-1)//arr 원소 값이 -1일 경우엔만 초기화
            {
                arr[ch-'a']=i;
            }
        }
        for (int val:arr){
            //배열 출력
            System.out.print(val+" ");
        }


    }
}
