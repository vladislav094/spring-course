package spring.course.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.course.bean.Person;

public class Test3 {

    public static void main(String[] args) {
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(CourseConfiguration.class);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Person person = context.getBean("person", Person.class);

//        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

    }
}
