public class Lesson3 {
    public static void main(String[] args) {

        Arr01();
        ArrEmpty();
        Arr6x2();
        DoubleArr(7);

        // для проверки п.5 выводим передаваемый массив в консоль
        int[] DimArrNew = OneDimArr(3, 2);
        for (int i = 0; i < DimArrNew.length; i++) {
            System.out.print(DimArrNew[i] + " ");
        }
    }

    // п. 1
    private static void Arr01() {
        System.out.println("\nп.1 Инвертирование элементов массива 0 -> 1, 1 -> 0");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // п. 2
    private static void ArrEmpty() {
        System.out.println("\n\nп.2 Заполнение массива");
        //System.out.println();
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++) {
            arr[i] = i+1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    // п. 3
    private static void Arr6x2() {
        System.out.println("\nп.3 Умножение на 2 элементов массива меньших 6");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // п. 4
    private static void DoubleArr(int n) {
        System.out.println("\n\nп.4 Заполнение диагоналей");

        // для наглядности остальные элементы массива заполняем нулями
        int[][] arr = new int[n][n];
        // заполняем первую диагональ
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = 0;
                    }
                }
            }

        // заполняем обратную диагональ
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
                arr[i][j] = 1;
                j = j - 1;
            }

        // Вывод массива в виде таблицы
        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    // п. 5
    public static int[] OneDimArr (int len, int initialValue) {
        System.out.println("\nп.5 Возвращение одномерного массива");
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        } return arr;
    }
}