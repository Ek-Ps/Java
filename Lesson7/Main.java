package Lesson7;

public class Main {

    public static void main(String[] args) {
        // п 1 - 4
        Cats cat1 = new Cats("Мурзик", 50);
        Cats cat2 = new Cats("Бабасик", 100);

        Plates plate1 = new Plates(100);

        cat1.eat(plate1);
        cat2.eat(plate1);
        // если кот поел, выведется true
        // если кот остался голоден, выведется false
        System.out.println("\n" + cat1.getName() + " " + cat1.getSatiety());
        System.out.println(cat2.getName() + " " + cat2.getSatiety() + "\n");
        System.out.println("В миске осталось количество еды = " + plate1.getFood() + "\n");

        //п 5
        plate1.setFood(45); // устанавливаем количество еды в миске

        Cats[] catsArr = new Cats[4]; // объявляем массив голодных котов
        catsArr [0] = new Cats("Том", 10);
        catsArr [1] = new Cats("Батон", 30);
        catsArr [2] = new Cats("Кекс", 40);
        catsArr [3] = new Cats("Мартын", 20);

        // каждый из массива котов должен, как минимум, подойти к миске
        for (int i = 0; i < catsArr.length; i++){
            catsArr[i].eat(plate1);
            // отдельно вывод на экран с проверкой голоден ли кот не делалось, вывод на экран сделан в классе plates
        }
        System.out.println("\nВ миске осталось количество еды = " + plate1.getFood());

        //п 6
        plate1.setFood(10); // установили новое количество еды в миске
        System.out.println("\nКоличество еды в миске = " + plate1.getFood());

        plate1.addFood(5); // добавляем к имеющейся еде небольшое количество
        System.out.println("Общее количество еды в миске после добавки = " + plate1.getFood());
    }

}
