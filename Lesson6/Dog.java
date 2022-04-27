package Lesson6;

public class Dog extends Animal {

    private static int countDog;

    public Dog (String Name) {
        super(Name);
        countDog++;
    }

    @Override
    public void run (int Distance) {
        if (Distance > 500) {
            System.out.println(this.Name + " успешно пробежал(а) только 500 м, оставшиеся " + (Distance - 500) + " м бежать отказывается" );
        } else {
            System.out.println(this.Name + " пробежал(а) " + Distance + " м");
        }
    }

    @Override
    public void swim (int Distance) {
        if (Distance > 10) {
            System.out.println(this.Name + " успешно проплыл(а) только 10 м, оставшиеся "+ (Distance - 10) + " м плыть не хочет, может утонуть" );
        } else {
            System.out.println(this.Name + " проплыл(а) " + Distance + " м");
        }
    }

    public static int get(){
        return countDog;
    }
}
