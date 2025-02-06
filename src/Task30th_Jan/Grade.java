package Task30th_Jan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        float marks;
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Marks");
            marks = sc.nextFloat();

            if (marks >= 0 && marks <= 100) {
                if (marks >= 90 && marks <= 100) {
                    System.out.println("Your grade is A+");
                } else if (marks >= 80 && marks <= 89) {
                    System.out.println("Your grade is A");
                } else if (marks >= 70 && marks <= 79) {
                    System.out.println("Your grade is B");
                } else if (marks >= 60 && marks <= 69) {
                    System.out.println("Your grade is C");
                } else if (marks >= 50 && marks <= 59) {
                    System.out.println("Your grade is D");
                } else if (marks >= 40 && marks <= 49) {
                    System.out.println("Your grade is E");
                } else if (marks >= 1 && marks <= 39) {

                    System.out.println("Fail");
                }

            }
        }
                        catch(InputMismatchException e){
                    System.out.println("Enter Valid input");
                }

            }
        }
