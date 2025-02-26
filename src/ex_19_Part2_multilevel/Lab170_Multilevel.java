package ex_19_Part2_multilevel;

public class Lab170_Multilevel {
    public static void main(String[] args) {
        Son mani = new Son();
        Father f1 = new Father();
        GrandFather f2 = new GrandFather();

        mani.home();
        f1.fh();
        f1.home();
        f2.fh();
    }
}
