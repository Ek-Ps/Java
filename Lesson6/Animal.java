package Lesson6;

public class Animal {

    String Name;
    private static int count;

    public Animal(String Name) {
        this.Name = Name;
        count++;
    }

    public void run (int Distance) {
            System.out.println(this.Name + " пробежал(а) " + Distance);
    }

    public void swim (int Distance) {
            System.out.println(this.Name + " проплыл(а) " + Distance);
    }

    public static int get(){
        return count;
    }
}
