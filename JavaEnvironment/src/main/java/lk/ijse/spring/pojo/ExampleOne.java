package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class ExampleOne implements InitializingBean {

    //    @Value("${os.name}")
//    private String myOSName;
//
//    @Value("${USERNAME}")
//    private  String myLogName;
//
    @Value("${db.username}")
    private String myProjectName;

    @Autowired
    Environment env;


    @Override
    public void afterPropertiesSet() throws Exception {
       //meka nikan call karala bh properties tyn thana introduce krl denn one container ekt (AppConfig)
        System.out.println(myProjectName);


        String property = env.getRequiredProperty("my.projectname");
        System.out.println("property :"+property);
//
//        String user = env.getRequiredProperty("db.username");
//        System.out.println(user);
//    }
    }
}