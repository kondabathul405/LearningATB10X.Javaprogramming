package Task31st_Jan;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter consumed units :");
        int units =sc.nextInt();

        //First 100 units: 0.50Rs per unit
        // Next 100 units (101-200): 0.75Rs per unit
        //Next 100 units (201-300): 1.20Rs per unit
        //Above 300 units: 1.50Rs per unit
        if(units>0 && units<=100){
            double bill = units*0.50;
            System.out.println("Electricity bill RS. + bill");
        }
        else if(units>101 && units<=200){
            double bill = units*0.75;
            System.out.println("Electricity bill RS. + bill");
        }
        else if(units>201 && units<=300){
            double bill =units*1.20;
            System.out.println("Electricity bill RS. + bill");
        }
        else if(units>300){
            double bill = units*1.50;
            System.out.println("Electricity bill RS. + bill");
        }
    }
}
