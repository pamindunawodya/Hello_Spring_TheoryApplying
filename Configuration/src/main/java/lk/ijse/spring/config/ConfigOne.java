package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class ConfigOne {
    public ConfigOne(){
        System.out.println("ConfigOne : Instatiated");
    }

    @Bean
    public SBeanOne sBeanOne(){
     return new SBeanOne();

    }


}
