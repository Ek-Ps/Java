package CoreLesson1;
/*
        8. Добавить класс Course (полоса препятствий), в котором будут находиться:
        9. массив препятствий;
        10. метод, который будет просить команду пройти всю полосу.
        11. внутри метода отвечающего за прохождение полосы - добавить проверку возможностей людей на преодаление этой полосы
*/
public class Course {
    public int [] conditions;
//    age;
//    height;
//    weight;
//    speed;

    public Course(int [] arr) {
        this.conditions = arr;
    }

    //10. метод, который будет просить команду пройти всю полосу.
    // 11. внутри метода отвечающего за прохождение полосы - добавить проверку возможностей людей на преодоление этой полосы

    public void doIt(Team team) {
        for (int i = 0; i < team.peopleArray.length; i++) {
            if(team.peopleArray[i].age >= this.conditions[0]) {
                if(team.peopleArray[i].height >= this.conditions[1]) {
                    if(team.peopleArray[i].weight >= this.conditions[2]) {
                        if(team.peopleArray[i].speed >= this.conditions[3]) {
                            team.peopleArray[i].setPassed(true);
                        }
                    }
                }
            }
        }
    }
}
