package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.course.bean.Dog;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Dog dog = context.getBean("myPet", Dog.class);
        dog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        yourDog.destroy();
        context.close();
    }
}
