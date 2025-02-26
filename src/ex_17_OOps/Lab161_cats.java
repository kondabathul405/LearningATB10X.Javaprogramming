package ex_17_OOps;

import static java.awt.PageAttributes.MediaType.C1;

public class Lab161_cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
            Cat c2 = null;
            new Cat();
            c1.running();
           //c2.running();   //Null pointer exception
        }
    }

        class Cat{

            String name;


        void running(){
            System.out.println("running");
        }
    }

