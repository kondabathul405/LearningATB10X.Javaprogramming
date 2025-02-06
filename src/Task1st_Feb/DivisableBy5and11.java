package Task1st_Feb;

import java.util.Scanner;

public class DivisableBy5and11 {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your num");
        num =sc.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println(num +"is divisable 5and11");
        }
        else{
            System.out.println(num +"is not divisable 5and11");
        }
    }
}
