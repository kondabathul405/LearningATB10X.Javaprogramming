package Task1st_Feb;

import java.util.Scanner;

public class Agelogic {
    public static void main(String[] args) {
        int age;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        age =sc.nextInt();
        if(age>0 && age<=12)
        {
            System.out.println("I'm child");
        }
        else if(age>13 && age<=19){
            System.out.println("Teenager");
        }
        else if(age>20 && age<=64){
            System.out.println("Adult");
        }
        else if(age<=65){
            System.out.println("Senior citizen");
        }
    }
}
