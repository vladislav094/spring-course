package spring.course.bean;

import org.springframework.stereotype.Component;

//@Component
public class Dog implements Pet {

    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Pet say: Bow-Wow");
    }

    public void init() {
        System.out.println("Dog init method");
    }

    public void destroy() {
        System.out.println("Dog destroy method");
    }
}
