package Lesson7;

public class Cats {
    private String name;
    private int appetite;
    private boolean satiety = false; // по умолчанию кот голоден = false. Если кот поел = true

    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plates plate){
        if ((plate.getFood() - appetite) >= 0) {
            plate.setFood(plate.getFood() - appetite);
            satiety = true;
            System.out.println("Кот " + this.name + " наелся до отвала от миски");
        } else {
            System.out.println("Кот " + this.name + " остался голодным");
            satiety = false;
        }
    }

    public String getName (){
        return name;
    }

    public boolean getSatiety (){
        return satiety;
    }

}
