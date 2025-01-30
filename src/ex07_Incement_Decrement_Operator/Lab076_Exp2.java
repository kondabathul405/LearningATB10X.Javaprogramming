package ex07_Incement_Decrement_Operator;

public class Lab076_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> A - ExpA  -> 11 , a -> 11 - U1
        // +
        // ++a -> B -> ExpB -> 12 ,  a -> 12 - U2
        // ExpA + ExpB -> 23
    }
}