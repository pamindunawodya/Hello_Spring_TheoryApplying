package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class HelloOne {
    public HelloOne() {
        System.out.println("HelloOne:instansiated");
    }
}
