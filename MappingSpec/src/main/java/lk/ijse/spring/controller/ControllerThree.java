package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/three")
public class ControllerThree {

//Mapping Spec FutherMore
    //character matcher is path segment

    @GetMapping(path = "C??1")
    public String testOne(){
        System.out.println("Okay 200");
        return "test one Invoked";

    }


    @GetMapping(path = "C???1")
    public String testTwo(){
        System.out.println("Okay 200");
        return "test two Invoked";

    }
}
