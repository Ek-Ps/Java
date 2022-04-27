package CoreLesson1;

// 2. Добавить класс People который будет содержать характеристики спортсменов

public class People {

    public String name;
    public int age;
    public int height;
    public int weight;
    public int speed;
    private boolean isPassed = false; // по умолчанию считаем препятствие не пройденным

    public People(String name, int age, int height, int weight, int speed){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void allInfo(){
        System.out.println(" Имя " + this.name + " Возраст " + this.age + " Рост " + this.height + " Вес " + this.weight + " Скорость " + this.speed);
    }

    public boolean getPassed() { // геттер прохождения препятствия
        return isPassed;
    }

    public void setPassed(boolean passed) { // сеттер прохождения препятствия
        isPassed = passed;
    }
}
