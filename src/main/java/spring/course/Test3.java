package spring.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.bean.Kitchen;
import spring.course.bean.Person;
import spring.course.bean.Pet;
import spring.course.di.config.CourseConfiguration;

public class Test3 {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(CourseConfiguration.class);

        Person person = context.getBean("person", Person.class);

        person.callYourPet();

    }
}
