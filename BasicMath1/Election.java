package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Election {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        for(int i=0; i<num;i++){
            int floor=Integer.parseInt(br.readLine());
            int index=Integer.parseInt(br.readLine());
            System.out.println(GetNum(index,floor));

        }
    }

    public static int GetNum(int index, int floor){
        if(index==1) return 1;
        if(floor==0) return index;
        return(GetNum(floor-1,index)+GetNum(floor,index-1));
    }
}
