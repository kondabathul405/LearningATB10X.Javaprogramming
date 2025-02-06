package Task30th_Jan;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        final double account_balance = 10000;
        double amount_withdraw;
        double updated_balance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount");
        amount_withdraw = sc.nextDouble();
        if (amount_withdraw>0 && amount_withdraw%100==0) {
            if (amount_withdraw <= account_balance) {
                updated_balance = account_balance - amount_withdraw;
                System.out.println("Amount withdraw successfully and balance is " + updated_balance);
            } else if (amount_withdraw >= account_balance) {
                System.out.println("Insuuficient balance");
            } else {
                System.out.println("amount should be grater than 0 and multiple of 100");
            }
        }
    }
}