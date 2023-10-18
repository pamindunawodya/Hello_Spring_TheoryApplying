package lk.ijse.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/controllers")
public class ControllerOne {

    public ControllerOne() {
        System.out.println("controllerOne:Instansiaed");
    }

    @GetMapping
    public ModelAndView invokeMe(){
        System.out.println("Okay:200 ");
        return new ModelAndView("/Controllers");
    }
}
