package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.SpringBeanOne;
import lk.ijse.spring.pojo.SpringBeanThree;
import lk.ijse.spring.pojo.SpringBeanTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppinItializer {

    public static void main(String[]args){

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

//        SpringBeanOne bean = ctx.getBean(SpringBeanOne.class);
//        System.out.println(bean);
//
        SpringBeanTwo springBeanTwo = (SpringBeanTwo) ctx.getBean("springBeanTwo");
        System.out.println(springBeanTwo);

        SpringBeanThree springBeanThree = (SpringBeanThree) ctx.getBean("springBeanThree");
        System.out.println(springBeanThree);

    }

}
