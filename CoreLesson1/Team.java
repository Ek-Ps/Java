package CoreLesson1;

//        3. Добавить класс Team, который будет содержать:
//        4. название команды;
//        5. массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//        6. метод для вывода информации о членах команды, прошедших дистанцию;
//        7. метод вывода информации обо всех членах команды

public class Team {

    public String teamName;
    public People [] peopleArray;

    public Team(String teamName, People ... peopleArray ) {
        this.teamName = teamName;
        this.peopleArray = peopleArray;
    }

    public void getAllinfo(){
        System.out.println("--== " + this.teamName + " ==--");
        for (int i = 0; i < peopleArray.length; i++)
            peopleArray[i].allInfo();
        System.out.println("--------------------");
    }

    public void showResults(){
        for (int i = 0; i < peopleArray.length; i++) {
            if (peopleArray[i].getPassed()) {
                System.out.println(this.teamName + ": " + this.peopleArray[i].name + " прошёл(а) препятствия");
            }
        }

    }
}
