package lk.ijse.aad.config;

import lk.ijse.aad.pojo.BasicDataSource;
import lk.ijse.aad.pojo.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad")
public class AppConfig {


    //Bean Class
    @Bean
    public BasicDataSource basicDataSource(){
        return new BasicDataSource();
    }

    @Bean(name = "myOrder")
    public Order order(){
        return new Order();
    }
}
