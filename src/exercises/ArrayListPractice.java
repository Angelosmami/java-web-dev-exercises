package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        int sum = 0;
        int totalSum =0;
        for (int i: num) {
            if (num.get(i) % 2 == 0) {
                sum += i;
            }
        }
            System.out.println(sum);
    }
}
