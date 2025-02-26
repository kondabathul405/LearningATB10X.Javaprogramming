package ex_18_OOPS_Constructor;

public class Lab164_Car {
    public static void main(String[] args) {
        Car scoda = new Car();
        scoda.name = "scoda model3";
        scoda. year = 2024;
        scoda.model = "old model";
        System.out.println(scoda.name);
        System.out.println(scoda.year);
        System.out.println(scoda.model);

        System.out.println("---");


        Car tavera = new Car();
        tavera.name ="Tavera model1";
        tavera. year =2023;
        tavera.model = "new model";

        System.out.println(tavera.model);
        System.out.println(tavera.year);
        System.out.println(tavera.name);
    }
}
