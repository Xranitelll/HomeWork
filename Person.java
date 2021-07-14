import java.util.Arrays;

public class Person {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    Person(String fullName, String position, String email, String phoneNumber, int salary, int age){
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.salary = salary;
    this.age = age;
    }

    void personInfo() {
        System.out.println("Сведения о сотруднике:");
        System.out.println(fullName + " "  +  position + " " + email + " "  + phoneNumber + " " + salary + " "  + age );
    }
}
