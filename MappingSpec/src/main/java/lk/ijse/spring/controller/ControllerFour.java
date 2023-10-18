package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/four")

public class ControllerFour {

    //wild card  Mapping
    //matches one or more characters path segment
    @GetMapping("/one/*/two")
    public String methodOne(){
        System.out.println("Invoked method one");
        return "Invoked method One";
    }


    @GetMapping("/two/*/last/*/two")
    public String methodTwo(){
        System.out.println("Invoked method two");
        return "Invoked method two";
    }

//dual wild  card mapping
//mathches more than one segment

    @GetMapping("/four/**/three")
    public String methodThree(){
        System.out.println("Invoked method three");
        return "Invoked method three";
    }
}
