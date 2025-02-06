package Task31st_Jan;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string :");
        String word =sc.next();
        String reverse="";

        for(int i=0; i<word.length();i++){
            reverse=word.charAt(i)+reverse;
        }
        if(reverse.equals(word)){
            System.out.println(reverse + "word is palindrom");
        }
        System.out.println(reverse + "word is not palindrom");

    }
}
