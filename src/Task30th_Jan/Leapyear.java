package Task30th_Jan;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter year");
            year = sc.nextInt();

            if (year%4==0) {
                if (year%100==0) {
                    if (year%400==0) {
                        System.out.println("It's leapyear");
                    } else {
                        System.out.println("It's not a Leapyear");
                    }
                }
            }
            else
            {
                System.out.println("It's not a Leapyear");
            }
        }
    }}
