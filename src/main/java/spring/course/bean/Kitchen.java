package spring.course.bean;

import org.springframework.stereotype.Component;

@Component
public class Kitchen {

    public void cook(String order) {
        System.out.println("Kitchen start cooking your order: " + order);
    }
}
