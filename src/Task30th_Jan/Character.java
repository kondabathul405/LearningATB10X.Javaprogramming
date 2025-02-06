package Task30th_Jan;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        c = sc.next().charAt(0);
        if ((c > 'a' && c <= 'z') || (c > 'A' && c < 'z')) {
            System.out.println("It's a character");
        } else
            System.out.println("it's not a character");
    }
    }