package Task29th_if_else;

import java.util.Scanner;

public class Number_Even_odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a int  number");
        int num = sc.nextInt();

        //int a =10;
         if(num%2==0){
             System.out.println("number is even");
         }
         else{
             System.out.println("number is odd");
         }
         sc.close();
    }
}
