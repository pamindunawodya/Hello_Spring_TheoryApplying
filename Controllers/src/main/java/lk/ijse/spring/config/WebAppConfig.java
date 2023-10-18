package lk.ijse.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.spring")
@Configuration
public class WebAppConfig {

@Bean
    public ViewResolver viewResolver(){
    InternalResourceViewResolver rsv=new InternalResourceViewResolver();
    rsv.setPrefix("/WEB-INF/view");
    rsv.setSuffix(".jsp");
    return rsv;
    }
}
