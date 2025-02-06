package Task30th_Jan;

import java.util.Scanner;

public class Tringle_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three lengths :");

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 + side2 >side3) && (side2 + side3 > side1) && (side3 + side1 > side2)) {
            System.out.println("The given sides from valid triangle");
        } else {
            System.out.println("The given sides do not from valid triangle");
        }
    }
}



