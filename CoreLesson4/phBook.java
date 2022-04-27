package CoreLesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phBook {
    private Map <String, List <String>> phBook = new HashMap<>();

    public void add(String name, String pNumber) {

        List <String> phNumbers; // добавляем лист для хранения номеров

        if (phBook.containsKey(name)) { // если фио совпадают
            phNumbers = phBook.get(name);
            phNumbers.add(pNumber);
            phBook.put(name, phNumbers);

        } else {
            phNumbers = new ArrayList<>(); // если фио не совпадают
            phNumbers.add(pNumber);
            phBook.put(name, phNumbers);
        }
    }

    public List <String> get(String name) {
        if (phBook.get(name) != null) {
            return phBook.get(name);
        } else {
            return Collections.singletonList("Записи " + name + " нет в справочнике");
            // не разобралась что такое singletonlist, это подсказка от intellij
        }
    }
}
