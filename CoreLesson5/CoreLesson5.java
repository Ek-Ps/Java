package CoreLesson5;
/*
    1. Реализовать сохранение данных в csv файл;
    2. Реализовать загрузку данных из csv файла. Файл читается целиком.
    Структура csv файла:
    | Строка заголовок с набором столбцов |
    | Набор строк с целочисленными значениями |
    | * Разделитель между столбцами - символ точка с запятой (;) |

    Пример:
    Value 1;Value 2;Value 3
    100;200;123
    300,400,500
    Для хранения данных использовать класс вида:
    public class AppData {
      private String[] header;
      private int[][] data;

     // ...
    }
    Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
 */

public class CoreLesson5 {
    public static void main(String[] args) {

        String [] header = {"Заголовок 1","Заголовок 2","Заголовок 3","Заголовок 4"};
        int [][] arrNumber = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
            AppData appData = new AppData(header, arrNumber);
            appData.save("demo.csv"); // записываем данные в файл
            appData.read("demo.csv"); // считываем данные из файла
    }
}
