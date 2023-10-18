package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/five")
public class ControllerFive {

    //http://localhost:8080/mapping/five?id=C001&name=Kamal
    //id,name

    @GetMapping(params = {"id","name"})
    public String testOne(String id,String name){
        System.out.println("Okay 200"+id+name);

        return "test one invoked" ;
    }

    @GetMapping(params = {"address","salary"})
    public String testTwo(String address,String salary){
        System.out.println("Okay 200  :"+address+"|"+salary);

        return "test one invoked" ;
    }

    //@request param use karnne query parameter ekyi variable name ekyi wenas unoth
    public String testThree(@RequestParam("myAddress")String address, String salary){
        System.out.println("Okay 200  :"+address+"|"+salary);

        return "test one invoked" ;
    }


}

