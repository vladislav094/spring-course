package spring.course.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.bean.Person;
import spring.course.bean.Pet;
import spring.course.di.config.CourseConfig;

public class Test5 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CourseConfig.class);
//        Person person = context.getBean("person", Person.class);
//        person.callYourPet();

        Pet cat = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
//        cat.say();
//        cat2.say();

        System.out.println(cat);
        System.out.println(cat2);
        context.close();
    }
}
