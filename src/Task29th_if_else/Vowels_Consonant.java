package Task29th_if_else;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vowels_Consonant {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        char ch1 = Character.toLowerCase(ch);
        if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("consonent");
        }
    }}