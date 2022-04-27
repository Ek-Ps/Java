package Lesson6;

public class Main {
    public static void main(String[] args) {
        Animal Animal = new Animal("Тузик"); // для разнообразия, непонятное животное.
        Cat Cat = new Cat("Барсик");
        Dog Dog = new Dog("Бобик");
        Dog Dog1 = new Dog("Бутузик");

        System.out.println();

        Cat.run(2400);
        Cat.swim(10);

        System.out.println();

        Dog.run(40);
        Dog.swim(100);
        System.out.println();

        Dog1.run(10);
        Dog1.swim(10);
        System.out.println();

        System.out.println("Общее количество животных = " + Lesson6.Animal.get());
        System.out.println("Общее количество котов = " + Lesson6.Cat.get());
        System.out.println("Общее количество собак = " + Lesson6.Dog.get());
    }

}
