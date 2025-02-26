package Task_9thFeb;

import java.util.Arrays;

public class Second_Smallest_numbers {
    public static void main(String[] args) {
        int[] array={34,56,78,54,68,12};

                Arrays.sort(array);

                int secondMin=array[1];
        System.out.println("Second smallest number:"+secondMin);
    }
}
