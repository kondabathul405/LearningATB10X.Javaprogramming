package ex06_TernaryOperator;

public class Lab068_Age_Classification {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);



        // Adult, Minor, Senior
        // Senior > 65,
        // Minor < 18
        //Adult > 18


        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);

    }
}
    }
}
