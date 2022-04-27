package CoreLesson5;

import java.io.*;

public class AppData {
    private final String[] header;
    private final int[][] data;
    // intellij предложила сделать эти переменные типа final, так и должно быть?

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String file){
        // запись файла с построчным выводом в файл

        File f = new File("src/CoreLesson5/" + file);

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f))) {
            for (String hText : this.header) {
                hText += (";"); // добавляем разделитель после каждого элемента массива
                byte[] outData = hText.getBytes();
                out.write(outData); // пробовала по-разному выводить. В текстовом формате (блокнотом) читается нормально
                // если открывать с помощью excel, вместо русских строк - "крякозябры"
            }
            out.write("\n".getBytes()); // перенос строки после вывода заголовков

            // с помощью List было бы проще выводить, а тут массивы,
            // поэтому такое нагромождение кода

            for (int i = 0; i < this.data.length; i++) {
                for (int j = 0; j < this.data[i].length; j++) {
                    String data = String.valueOf(this.data[i][j]) + ";";

                    // преобразовываем int -> в String, добавляем разделитель ';'
                    // есть подозрение, что если выводить не через преобразование в текст, то
                    // отрицательные числа будут выводиться некорректно
                    // не нашла как быстрее перебрать двумерный массив с записью в файл,
                    // с помощью foreach не получилось, с помощью Arrays.tostring() не разобралась.

                    byte[] outData = data.getBytes();
                    out.write(outData);
                }
                out.write("\n".getBytes()); // переводим строку после вывода строки i-х элементов массива
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(String file){
        // чтение файла с построчным выводом

        File f = new File("src/CoreLesson5/" + file);

        try (BufferedReader read = new BufferedReader(new FileReader(f))){
            String str;
            while ((str = read.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
