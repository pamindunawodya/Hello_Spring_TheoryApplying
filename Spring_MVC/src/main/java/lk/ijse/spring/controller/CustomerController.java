package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class CustomerController {

@GetMapping
    public String hello(){
    System.out.println("Okay:200");
    return "Hello Spring";
}

}
