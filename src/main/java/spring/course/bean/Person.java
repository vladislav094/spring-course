package spring.course.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    //    Аннотация над полем не рекомендуется
    //    @Autowired
    private Pet pet;

    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    //    @Autowired
//    public Person(@Qualifier("dog") Pet pet) {
    public Person(Pet pet) {
        System.out.println("Person bean is created use constructor with argument");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created");
    }

    public Pet getPet() {
        System.out.println("Class Person: get pet - ");
        return pet;
    }

    public String getSurname() {
        System.out.print("Class Person: get surname - ");
        return surname;
    }

    public int getAge() {
        System.out.print("Class Person: get age - ");
        return age;
    }


    //    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet object");
        this.pet = pet;
    }

//    public void setSurname(String surname) {
//        System.out.println("Class Person: set surname");
//        this.surname = surname;
//    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("- Hello, my lovely pet!");
        System.out.print("Pet answer: ");
        pet.say();
    }
}
