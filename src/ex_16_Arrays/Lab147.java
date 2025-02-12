package ex_16_Arrays;

import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        int[] marks ={23,45,34,67,98};
                System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("-------");


        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
    }
}
