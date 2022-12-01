package BaekJoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Special_recursion_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());

        for (int i=0;i<num;i++){
            //문자열 입력
            String s=br.readLine();
            System.out.println(String.format("%d %d",isPalindrome(s)[0],isPalindrome(s)[1]));
        }

        System.out.println();

    }

    public static int[] isPalindrome(String s){
        return recursions(s,0,s.length()-1,1);
    }
    public static int[] recursions(String s, int l, int r,int count){
        int num=count;

        if(l>=r) return new int[]{1,count};
        else if (s.charAt(l)!=s.charAt(r)) return new int[]{0,count}; //left, right
        else {num++;return recursions(s,l+1,r-1,num);}
    }
}
