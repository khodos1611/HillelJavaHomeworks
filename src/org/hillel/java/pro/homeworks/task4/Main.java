package org.hillel.java.pro.homeworks.task4;

public class Main {
    public static void main(String[] args) {

        Animals dogBob = new Dog();
        dogBob.run(120);
        dogBob.run(800);

        dogBob.swim(500);
        dogBob.swim(5);

        Animals cat1 = new Cat();
        cat1.run(150);
        cat1.run(300);

        cat1.swim(5);

        Animals cat2 = new Cat();
        cat2.run(150);
        cat2.run(300);

        System.out.println("Створено тварин : " +Animals.getCountEntities());
        System.out.println("Створено собак : "  +Dog.getCountDogs());
        System.out.println("Створено котів : "  +Cat.getCountCats());




    }
}