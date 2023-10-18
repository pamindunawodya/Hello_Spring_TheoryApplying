package lk.ijse.spring;


import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.A;
import lk.ijse.spring.pojo.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInitializer {
    public static void main(String[]args){
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        A bean = ctx.getBean(A.class);
        bean.sendReqToB();

//        B bean1 = ctx.getBean(B.class);
//        System.out.println(bean1);

    }
}
