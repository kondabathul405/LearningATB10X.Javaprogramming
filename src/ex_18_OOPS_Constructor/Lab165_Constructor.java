package ex_18_OOPS_Constructor;

import java.util.Scanner;

public class Lab165_Constructor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the model name for scoda");
        String model_name=sc.next();
        Car2 scoda = new Car2(model_name,2025);
        System.out.println(scoda.year);
        System.out.println(scoda.model);

        System.out.println("----");

        System.out.println("Enter the model name");
        String model_name2=sc.next();
        Car2 tavera= new Car2(model_name,2023);
        System.out.println(tavera.year);
        System.out.println(tavera.model);

    }
}
