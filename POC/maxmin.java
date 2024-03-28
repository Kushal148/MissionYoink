package POC;

import java.util.Arrays;
import java.util.List;

public class maxmin {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 1, 7);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int element : list) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }

        System.out.println(max + " " + min);
    }
}
