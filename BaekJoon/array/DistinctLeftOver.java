package BaekJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DistinctLeftOver {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arList=new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arList.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(arList.stream().distinct().count());






    }
}
