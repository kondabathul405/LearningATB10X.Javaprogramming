package Task29th_if_else;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vowels_Consonant {
    public static void main(String[] args) {
        String c;
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your String");
            c=sc.next();

            for(int i=0;i<c.length();i++)
            {
                if(c.charAt(i)=='a'|| c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u')
                {
                    System.out.println(c.charAt(i) + " is vowel");

                }
                else if(c.charAt(i)>='a' && c.charAt(i)<='z')
                {
                    System.out.println(c.charAt(i) + " is consonant");
                }}
        }catch( InputMismatchException e)
        {
            System.out.println( "please enter alphabets string");
        }}}
