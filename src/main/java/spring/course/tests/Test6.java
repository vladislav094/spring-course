package spring.course.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.course.bean.Dog;
import spring.course.bean.Person;
import spring.course.di.config.CourseConfig;

public class Test6 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CourseConfig.class);
        Person person = context.getBean("personBean", Person.class);

        System.out.println(person.getSurname());

        context.close();
    }
}
