package Lesson6;

public class Cat extends Animal{

    private static int countCat;

    public Cat(String Name) {
        super(Name);
        countCat++;
    }

    @Override
    public void run (int Distance) {
        if (Distance > 200) {
            System.out.println(this.Name + " успешно пробежал(а) только 200 м, оставшиеся " + (Distance-200) + " м бежать отказывается" );
        } else {
            System.out.println(this.Name + " пробежал(а) " + Distance + " м");
        }
    }

    @Override
    public void swim (int Distance) {
        System.out.println(this.Name + " не умеет плавать. Расстояние в " + Distance + " м для него смерти подобно");
    }

    public static int get(){
        return countCat;
    }
}
