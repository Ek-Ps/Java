package Lesson5;

public class Person {

        // ФИО, должность, email, телефон, зарплата, возраст.
        String fio;
        String position;
        String email;
        String phoneNumber;
        int salary;
        int age;

        public Person(String fio, String position, String email, String phoneNumber, int salary, int age){
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
            // 3
            System.out.println(this.fio + " " + this.position + " " +  this.email + " " + this.phoneNumber + " " + this.salary + " " + this.age);
        }
}