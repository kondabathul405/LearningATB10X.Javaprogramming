package Task7th_Feb;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int result =1;
        while(num>0) {
            result = result * num;
            num = num - 1;
        }
        System.out.println("Factorial of Number:"+result);
        }
    }
