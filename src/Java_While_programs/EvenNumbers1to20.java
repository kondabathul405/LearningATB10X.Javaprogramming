package Java_While_programs;

public class EvenNumbers1to20 {
    public static void main(String[] args) {
        System.out.println("EvenNumbers1to20 :");
        int n=0;
        while(n<20){
            if(n%2==0)
                System.out.println(" "+n);
            n++;
        }
    }
}
