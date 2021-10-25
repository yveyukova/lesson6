/**
 * Java 1. Homework 6
 *
 * @author Juliya Veyukova
 * @version 25.10.2021
 */
public class lesson6 {

    public static void main(String[] args) {

        IAnimal cat = new Cat();
        System.out.println( cat.run(250) );
        System.out.println( cat.swim(250) );
        IAnimal dog = new Dog();
        System.out.println( dog.run(250) );
        System.out.println( dog.swim(5) );
    }


}












