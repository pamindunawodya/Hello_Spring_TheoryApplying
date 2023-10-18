package lk.ijse.spring.config;



import lk.ijse.spring.pojo.BasicDataSource;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    public AppConfig() {
        System.out.println("App Config : Instantiated");

    }

@Bean
//prototype karnnna one nam scope ek dnw
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public BasicDataSource basicDataSource(){
    return new BasicDataSource();
}

}
