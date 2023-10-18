package lk.ijse.aad;

import lk.ijse.aad.config.AppConfig;
import lk.ijse.aad.pojo.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public  static void main(String[]args){

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //Context Inovacation
        //1.Class Type
        //2.Bean ID

        DBConnection db = ctx.getBean(DBConnection.class);
        System.out.println(db);

        //Class Type(class name eke 1st letter ek simple )
        Hello hello = (Hello) ctx.getBean("hello");
        System.out.println(hello);

        //Bean ID(App config eke method ek create karapu name ek)
        BasicDataSource basicDataSource = (BasicDataSource) ctx.getBean("basicDataSource");
        System.out.println(basicDataSource);

        //Apita ona vidiyata Bean ID eke Define kragnnw : @Component("Item")
        ItemController item = (ItemController) ctx.getBean("Item");
        System.out.println(item);

        //Apita ona vidiyata Bean ID eke Define kragnnw : @Bean(name="myOrder")
        Order order = (Order) ctx.getBean("myOrder");
        System.out.println(order);

        ctx.close();
    }
}
