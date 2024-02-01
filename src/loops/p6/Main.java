package loops.p6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static double average(List<Integer> arr){
        int sum = 0;
        for(Integer i : arr){
            sum+=i;
        }
        return (double)sum/(double) arr.size();
    }
    public static void main(String[] args) {
        Integer[] temp = {1,2,3,4,5,6,7};
        List<Integer> arr = Arrays.asList(temp);
        System.out.println(average(arr));
    }
}
