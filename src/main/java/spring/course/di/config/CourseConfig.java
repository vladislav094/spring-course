package spring.course.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring.course.bean.*;

@Configuration
//@ComponentScan("spring.course")
public class CourseConfig {

    @Bean
    public Kitchen kitchenBean() {
        return new Kitchen();
    }

    @Bean
    @Scope("singleton")
    public Person personBean() {
        return new Person(catBean());
    }

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

//    @Bean
//    public Dog dogBean() {
//        return new Dog();
//    }
//
//    @Bean
//    public Cat catBean() {
//        return new Cat();
//    }
}
