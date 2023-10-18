package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class ControllerTwo {


    //if the ambigious mapping
    @GetMapping("/m1")
    public String methodOne() {
        return "Get Mapping One";
    }

    @GetMapping("/m2")
    public String methodTwo() {
        return "Get Mapping Two";

    }

    //path variable

    //C001 kiyanne variable ekak onama valuwe ekak e wenuwata type krnn puluwn
    @GetMapping("/m3/no/{C001}/ijse")
    public String methodThree(@PathVariable("C001")String id) {
        return "Get mapping threee invoked"+id;
    }

    //validate path variables

    @GetMapping(path = "/name/{name:[A-Z]{4}}/{id:[C]{1}[0-9]{3}}")
    public String methodFour(@PathVariable String name,@PathVariable String id){
        System.out.println("Okay 200");
        return "method six Invoked :"+id+":"+name;

    }
}