package Lesson7;

public class Plates {
    private int food;

    public Plates(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    //п 6 делаем добавку еды в миску
    public void addFood(int add) {
        this.food = this.getFood() + add;
    }
}
