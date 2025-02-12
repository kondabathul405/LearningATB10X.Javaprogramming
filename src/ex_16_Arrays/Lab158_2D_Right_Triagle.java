package ex_16_Arrays;

import java.util.Scanner;

public class Lab158_2D_Right_Triagle {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers n=5");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0; j<=i;j++){
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
