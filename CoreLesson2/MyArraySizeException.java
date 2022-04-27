package CoreLesson2;

public class MyArraySizeException extends Exception {

    private static String str = "Обрабатывается только массив 4х4";

    public MyArraySizeException() {
        super(str);
    }
    public MyArraySizeException(String s) {
        super(s);
    }

}
