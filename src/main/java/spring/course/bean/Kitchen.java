package spring.course.bean;

import org.springframework.stereotype.Component;

@Component("kitchen")
public class Kitchen {

    public void cook(String order) {
        System.out.println("We're start cooking your order: " + order);
    }
}
