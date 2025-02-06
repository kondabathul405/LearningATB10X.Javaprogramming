package Task1st_Feb;

import java.util.Scanner;

public class ConvertsDays {
    public static void main(String[] args) {
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        days = sc.nextInt();
        int year = days / 365;
        int rem_days = days % 365;
        int month = rem_days / 30;
        int day = rem_days % 30;
        System.out.println(year + "year" + month + "month" + day + "day");
    }
}




