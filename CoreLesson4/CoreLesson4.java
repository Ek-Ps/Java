package CoreLesson4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CoreLesson4 {

    /*
    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.

    2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
    искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
    (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

     */

    public static void main(String[] args) {
        question1();
        question2();
    }

    public static void question1() {

        System.out.println("\n-------== Задание  1 ==-------\n");

        // Объявляем массив из 20 слов
        String[] strArr = {"People", "Animal", "Orange", "Fruits",
                "Birds", "Apple", "Kids", "Dust", "People", "Абырвалг",
                "Buzzer", "Team", "Birds", "Kids", "Orange", "Смертокрыл",
                "Team", "Apple", "Bear", "Kids"};

        // заполняем map strMap значениями из массива strMap
        Map <String, Integer> strMap = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            if (strMap.containsKey(strArr[i])) {
                strMap.put(strArr[i], strMap.get(strArr[i]) + 1); // если встречается несколько раз, прибавляем на единицу
                // ранее думала, что номер/ключ должен быть уникальным для каждого значения
            } else {
                strMap.put(strArr[i], 1); // если встречается один раз, то value = 1
            }

        }

//        int x = 0;
//        for (String str : strArr) {
//            strMap.put(str, x);
//            x += 1;
//        }

        // проверяем заполнение map strMap (ключ и значение)
        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            System.out.println(entry.getValue() + " - " + entry.getKey());
        }
        System.out.println("\nВывод значений: ");

        // вывод уникальных значений, взяла из методички
        Set<String> uniStrMap = new HashSet<>();
        uniStrMap.addAll(List.of(strArr));

        System.out.println(uniStrMap);

        //System.out.println(strMap.entrySet());
    }

    public static void question2() {
        System.out.println("\n-------== Задание  2 ==-------\n");
        phBook myPhoneBook = new phBook();

        myPhoneBook.add("Anna", "+791231125");
        myPhoneBook.add("Anna", "+79253652145");

        myPhoneBook.add("Bella", "+7921231126");
        myPhoneBook.add("Bella", "+791231127");
        myPhoneBook.add("Bella", "+791231128");

        System.out.println(myPhoneBook.get("Anna"));
        System.out.println(myPhoneBook.get("Bella"));
        System.out.println(myPhoneBook.get("Valentina"));
    }
}