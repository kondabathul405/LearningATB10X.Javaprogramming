package Task30th_Jan;

import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        //try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1");
            num1 = sc.nextInt();
            System.out.println("Enter num2");
            num2 = sc.nextInt();
            System.out.println("Enter num3");
            num3 = sc.nextInt();

            if (num1 >= num2 && num2 >= num3) {
                System.out.println(num1 + "is greatest");
            } else if (num2 >= num3 && num2 >= num1) {
                System.out.println(num2 + "is greatest");
            } else if (num3 >= num1 && num3 >= num2) {
                System.out.println(num3 + "is greatest");
            }
        
            //Catch(InputMismatchException e){
               // System.out.println("Enter valid number");
            }
        }
