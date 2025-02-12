package ex_16_Arrays;

public class Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] numbers = {23, 3, 5};
        int sum = 0;
        //for(int i=0;i< numbers.length;i++){
        //   sum=sum+numbers[i];
        // }
        //System.out.println(sum);
        //}
        for (int n : numbers) {
            sum = sum + n;
        }
        System.out.println(sum);


    }
}
