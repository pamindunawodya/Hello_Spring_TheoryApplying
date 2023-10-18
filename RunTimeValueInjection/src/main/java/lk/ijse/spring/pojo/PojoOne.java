package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class  PojoOne {

    //Default constructor ek ho AppConfig Class eke @Bean dala values satisfy krl nttm @Value ek dann one

@Autowired(required = false)
    //Constructor 2k tynkota awshya ek select karanna @Autwired use krnw
    public PojoOne(@Value("Galle,Kaluthara,Panadura") String addresss[]) {

        for(String s : addresss ){
            System.out.println(s);
        }
    }

    //default costructor

//    public PojoOne() {
//        System.out.println("Default Costructor");
//    }


//[required=fale]  eken wenne wadipurama parameters inn kena thora gannwa
@Autowired(required = false)
    public PojoOne(@Value("Galle,Kaluthara,Panadura,yapahuwa") String addresss[],@Value("Kamal,Sumal,Sadun") String names[]) {

        for(String s : addresss ){
            System.out.println(s);
        }  for(String n : names ){
            System.out.println(n);
        }
    }

}
