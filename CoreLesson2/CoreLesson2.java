package CoreLesson2;

public class CoreLesson2 {

    public static void main(String[] args) throws Exception {
        // ----------- Подсчёт суммы элементов массива 4x4 --------------
        System.out.println("\n----------- Подсчёт суммы элементов массива 4x4 --------------\n");
        String[][] arrNumber = {
                {"1", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "10", "11"},
                {"12", "13", "14", "15"}
        };
        ExecuteArr(arrNumber); // вызов ф-ции подсчета содержимого массива 4х4
        System.out.println("\n--------------------------------------------------------------");

        //----------- Проверка обработки ошибки MyArraySizeException --------------
        try {
            String[][] arr = {
                    {"1", "1", "2", "3"},
                    {"4", "5", "6", "7"},
                    {"8", "9", "10", "11"},
                    {"12", "13", "14", "15"},
                    {"16", "17", "18", "19"} // для проверки MyArraySizeException
            };
            ExecuteArr(arr); // вызов ф-ции подсчета содержимого массива 4х4

        } catch (Exception e) {
            e.printStackTrace();
        }

        //----------- Проверка обработки ошибки MyArraySizeException --------------
        String[][] arr = {
                {"1", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "x", "11"}, // вот тут будет ошибка
                {"12", "13", "14", "15"}
        };
        ExecuteArr(arr); // вызов ф-ции подсчета содержимого массива 4х4
    }

    public static void ExecuteArr(String[][] arr) throws Exception {
        //arr.length - возвращает размерность i-ых элементов массива (верхняя граница)
        //arr[0].length - возвращает размерность j-ых элементов массива (верхняя граница)

        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException(); // обработка ошибки
        }

        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                //System.out.println(arr[i][j] + " | "+ i + " x " + j);
                try {
                    x += Integer.valueOf(arr[i][j]); // предлагает заменить на Integer.parseInt
                    // уточнить на лекции какой из методов больше применяется на практике и чем отличаются принципиально
                } catch (Exception e) {
                    throw new MyArrayDataException("Ошибка преобразования данных String -> int в массиве, элемент " + i + " x " + j);
                }
            }
        }
        System.out.println("Сумма всех элементов массива = " + x);
    }
}

