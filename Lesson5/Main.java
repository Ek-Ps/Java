package Lesson5;

public class Main {
    public static void main(String[] args) {
        //1 и 2
        System.out.println("\n---------- К заданию 1, 2, 3 ----------------");
        Person Person1 = new Person("Иванов Иван Иванович", "Инженегр","ivanov@mail.ru","+7-911-100-22-33", 50000, 30);

        // 4
        System.out.println("\n---------- К заданию 4 ----------------");
        Person [] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Сидоров Сидор Сидорович", "Engineer", "sidorov@mailbox.com", "+7-911-101-22-33", 30000, 35); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Петров Петр Петрович", "Engineer", "petrov@mailbox.com", "+7-911-102-22-33", 30000, 41);
        persArray[2] = new Person("Романов Роман Романович", "Engineer", "romanov@mailbox.com", "+7-911-103-22-33", 30000, 40);
        persArray[3] = new Person("Алексеев Алексей Алексеевич", "Engineer", "alekseev@mailbox.com", "+7-911-104-22-33", 30000, 48);
        persArray[4] = new Person("Владимиров Владимир Владимирович", "Engineer", "vladimirov@mailbox.com", "+7-911-105-22-33", 30000, 27);


        System.out.println("\n---------- К заданию 5 ----------------");
        // 5
        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age >= 40){
                System.out.println (persArray[i].fio + " " + persArray[i].position+ " " + persArray[i].email + " " + persArray[i].phoneNumber + " " + persArray[i].salary + " " + persArray[i].age);
            }
        }
    }
}
