package lk.ijse.spring.config;


import lk.ijse.spring.pojo.SpringBeanOne;
import lk.ijse.spring.pojo.SpringBeanThree;
import lk.ijse.spring.pojo.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//SpringBeanOne Ek Tyenne pojo Package ek athule eke tyn siyluma class scan karnawa
@ComponentScan(basePackageClasses = {SpringBeanOne.class})
public class AppConfig {

    //InterBean Dependancy innovacation
    @Bean


    public SpringBeanTwo springBeanTwo(){
        SpringBeanThree b1=springBeanThree();
        SpringBeanThree b2=springBeanThree();
        System.out.println(b1);
        System.out.println(b2);
        return new SpringBeanTwo();
    }
    @Bean
    @Scope("prototype")
    public SpringBeanThree springBeanThree(){
        return new SpringBeanThree();
    }

}
