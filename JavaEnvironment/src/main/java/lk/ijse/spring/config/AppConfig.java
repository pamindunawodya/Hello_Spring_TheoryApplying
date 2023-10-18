package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
//@PropertySource("classpath:src/application.properties")
public class AppConfig {
    public AppConfig(){
        System.out.println("App Config : Instantiated");
    }


}
