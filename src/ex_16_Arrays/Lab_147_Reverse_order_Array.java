package ex_16_Arrays;

public class Lab_147_Reverse_order_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 34, 45, 36, 89};
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
