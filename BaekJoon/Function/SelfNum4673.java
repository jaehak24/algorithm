package BaekJoon.Function;

public class SelfNum4673 {
    public static void main(String[] args) {
        boolean check[]=new boolean[10001];
        for (int i=0;i<=10000;i++){
            int num=d(i);
            if(num<=10000) check[num]=true;
        }
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<=10000;i++){
            if (!check[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);


    }

    public static int d(int num){
        int sum=num;

        while (num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

}
