package CoreLesson3;

import java.util.Arrays;

public class CoreLesson3 {

    public static void main(String[] args) {
        //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        System.out.println("\n-----------------------== Задание 1 == ---------------------------\n");
        Integer [] intArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        swap(intArr, 3, 5);

        String [] strArr = {"Ivan", "Nikolay", "Sergey"} ;
        swap(strArr, 1, 2);

        Double [] doubleArr = {1.3330, 2.24434, 3.2221, 4.442};
        swap (doubleArr, 2,3);

        Character [] charArr = {'a', 'b', 'c', 'd'};
        swap (charArr, 0,1);

        /*
        Задача:
        a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
        фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можно использовать ArrayList (ArrayList обсудим
        на следующем уроке);
        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
        и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
        коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
        равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
        апельсинами;
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
        объекты, которые были в первой;
        g. Не забываем про метод добавления фрукта в коробку.

         */

        System.out.println("-----------------------== Задача 2 == ---------------------------\n");
        // заводим новые коробки с фруктами
        Box <Orange> orange1 = new Box <> ();
        Box <Orange> orange2 = new Box <> ();
        Box <Apple> apple1 = new Box <>();
        Box <Apple> apple2 = new Box <> ();

        // добавляем в них фрукты
        orange1.addFruit(new Orange(),10);
        orange2.addFruit(new Orange(),1);
        apple1.addFruit(new Apple(),15);
        apple2.addFruit(new Apple(),5);

            // выводим вес коробок с фруктами
        System.out.println("Коробка 1, вес " + orange1.getWeight());
        System.out.println("Коробка 2, вес " + orange2.getWeight());

        System.out.println("Коробка 3, вес " + apple1.getWeight());
        System.out.println("Коробка 4, вес " + apple2.getWeight()+"\n");

        // сравниваем коробки по весу
        System.out.println("Коробка 1 равна ли Коробке 3: " + orange1.compare(apple1));
        System.out.println("Коробка 2 равна ли Коробке 4: " + orange1.compare(apple2)+"\n");

        // пересыпаем фрукты из коробки в коробку
        orange1.transferFruit(orange2);
        apple1.transferFruit(apple2);

            // проверяем вес каждой коробки после пересыпания
        System.out.println("Коробка 1, вес после пересыпания " + orange1.getWeight());
        System.out.println("Коробка 2, вес после пересыпания " + orange2.getWeight());
        System.out.println("Коробка 3, вес после пересыпания " + apple1.getWeight());
        System.out.println("Коробка 4, вес после пересыпания " + apple2.getWeight());
    }

    public static void swap(Object [] array, int x, int y){
        if (array.length < x || array.length < y || x < 0 || y < 0 ) {
            System.out.println("Элементы не могут быть меньше 0 или вне массива");
        } else {
            System.out.println("Массив данных, состав: " + Arrays.toString(array));
            Object tempArr = array[x];
            array[x] = array[y];
            array[y] = tempArr;
            System.out.println("Результат замены в массиве: " + Arrays.toString(array) + "\n");
        }
    }
}
