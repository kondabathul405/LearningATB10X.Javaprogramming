package ex_16_Arrays;

import java.util.Arrays;

public class Lab_151_InterviewQ {
    public static void main(String[] args) {
        //find second largest number in arrays

        int[] marks={23,34,35,47,98,46};
        Arrays.sort(marks);

        System.out.println(marks[marks.length-2]);
    }
}
