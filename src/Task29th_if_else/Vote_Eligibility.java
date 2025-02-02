package Task29th_if_else;

import java.util.Scanner;

public class Vote_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age!(as integer)");
        int age =sc.nextInt();

        //int age =19;
         if(age>18){
             System.out.println("You are allowed to vote");

        }
         else{
            System.out.println("You are not allowed to vote");
        }
    }
}
