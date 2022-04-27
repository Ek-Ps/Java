import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {// игра "крестики-нолики"

    public static void main(String[] args) {
        String[][] map = initMap(4);//задаём двумерный массив 3*3
        System.out.println("Поехали!");
        printMap(map);

        boolean isGameActive = true;
        while (isGameActive) {
            playerTurn(map);
            printMap(map);

            if (isWin("X", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }

            compTurn(map);
            printMap(map);

           if (isWin("0", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }
        }
    }

    public static String [][] initMap (int size) {
        String[][] map = new String[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = "*";
            }
        }
        return map;
    }

    public static boolean isWin (String mark, String[][] map) {
        int sumV;
        int sumH;
        int sumD1 = 0;
        int sumD2 = 0;
        for (int i = 0; i < map.length; i++) {
            sumH = 0;
            sumV = 0;
            for (int j = 0; j < map.length; j++) {

                // горизонталь
                if (map[i][j] == mark) {
                    sumH = sumH + 1;
                    if (sumH == map.length) {
                        System.out.println("Победил " + mark);
                        return true;
                    }
                }

                // вертикаль
                if (map[j][i] == mark) {
                    sumV = sumV + 1;
                    if (sumV == map.length) {
                        System.out.println("Победил " + mark);
                        return true;
                    }
                }
            }

            // диагональ слева направо
            if (map[i][i] == mark) {
                sumD1 = sumD1 + 1;
                if (sumD1 == map.length) {
                    System.out.println("Победил " + mark);
                    return true;
                }
            } else sumD1 = 0;

            // диагональ справа налево
            if (map[i][map.length - i - 1] == mark) {
                sumD2 = sumD2 + 1;
                if (sumD2 == map.length) {
                    System.out.println("Победил " + mark);
                    return true;
                }
            } else sumD2 = 0;
        }
    return false;
    }

    public static boolean isDraw (String[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Победила дружба!");
        return true;
    }

    public static void playerTurn (String[][] map) {
        System.out.println("Ход игрока. Введите координаты ячейки (строка, столбец)");
        Scanner sc = new Scanner(System.in);

        boolean isActiveTurn = true;

        while (isActiveTurn) {
            int x = sc.nextInt();
            int y = sc.nextInt();


            if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                if (map[x - 1][y - 1] == "*") { //.equals("*")
                    map[x - 1][y - 1] = "X";
                    isActiveTurn = false;
                } else {
                    System.out.println("Ячейка занята. Выберите другую.");
                }
            } else {
                System.out.println("Введены координаты за пределами поля.");
            }
        }
    }

    public static void compTurn (String[][] map) {
        System.out.println("Ход компьютера:");
        Random random = new Random();
        boolean isActiveTurn = true;

        while (isActiveTurn) {
            int x = random.nextInt(map[0].length);
            int y = random.nextInt(map.length);

            if (map[x][y] == "*") {
                    map[x][y] = "0";
                    isActiveTurn = false;
            }
        }
    }

    public static void printMap (String[][] map) {
    for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                // по видеоуроку так и не понятно для чего map[0]
                // проверяла разными способами, результат одинаковый.
                // в методичке  <= arr[0].length. такая запись выдаст ошибку.
                //map [i][j] = "*";
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
