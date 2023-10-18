package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;


@Component
public class pojoTwo implements InitializingBean {

    //meke bean  ek ready wenna klin api illanawa(constructor ek run wena welawedi) e sadaha implement krnw life cyle eke initializing Bean nttm null
    @Value("Colombo 07")
    String city;

    public pojoTwo(){
        System.out.println("PojoTwo: Instansiated");
        System.out.println("city :"+city);

    }
//initialize awsthawe use karanna one

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(city);


    }
}
