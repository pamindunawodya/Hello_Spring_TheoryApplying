package lk.ijse.spring;


import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[]args){



        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

//        SpringBeanOne bean = ctx.getBean(SpringBeanOne.class);
//        System.out.println(bean);


        //Container ek close kloth witarayi desroy (disposable bean)ek wada karanne.
        // ctx.close();


        //Jvm ek close wenn mohothakat pera run krnn
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//            ctx.close();
//            }
//        }));

       // meken karnneth uda method eke wademayi
//        ctx.registerShutdownHook();
//
//        SpringBeanOne bean1 = ctx.getBean(SpringBeanOne.class);
//        System.out.println(bean1);


    }
}
