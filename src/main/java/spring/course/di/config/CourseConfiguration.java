package spring.course.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.course.bean.Kitchen;

@Configuration
@ComponentScan("spring.course.di")
public class CourseConfiguration {

    @Bean(name = "kitchen")
    public Kitchen kitchen() {
        return new Kitchen();
    }
}
