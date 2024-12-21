package spring.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.course.bean.Kitchen;
import spring.course.di.config.CourseConfiguration;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
//        Pet pet = context.getBean("myPet", Pet.class);
//        person.setPet(pet);

        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        ApplicationContext appContext = new AnnotationConfigApplicationContext(CourseConfiguration.class);
        Kitchen kitchen = appContext.getBean("kitchen", Kitchen.class);
        kitchen.cook("First");

        context.close();
    }
}
