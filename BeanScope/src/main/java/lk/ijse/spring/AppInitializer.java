package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInitializer {
    public static void main(String[]args){
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();


        SpringBeanOne bean = (SpringBeanOne) ctx.getBean("springBeanOne");
        System.out.println(bean);

        SpringBeanOne bean1 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean1);


        BasicDataSource bean2 = (BasicDataSource) ctx.getBean("basicDataSource");
        System.out.println(bean2);

        ctx.registerShutdownHook();


    }
}
