package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLOutput;

public class ConfigTwo {

    public ConfigTwo() {
        System.out.println("ConfigTwo:Instansiated");
    }

    @Bean
    public SBeanTwo sBeanTwo(){
        return new SBeanTwo();
    }
}
