import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {

    public static int average(int k, int[] list){
        int average = 0;
        int n = Math.min(k, list.length);
        if(n>0){
            for (int i=0; i<n;i++){
                average += list[i];
            }
            average=average/n;
        }
        return average;
    }
}
