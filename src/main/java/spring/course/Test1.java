package spring.course;

import spring.course.bean.Cat;
import spring.course.bean.Dog;
import spring.course.bean.Pet;

public class Test1 {

    public static void main(String[] args) {
        Pet dog = new Dog();
        dog.say();

        Pet cat = new Cat();
        cat.say();
    }
}
