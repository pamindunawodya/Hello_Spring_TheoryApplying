package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/why")
public class ControllerSeven {

    //Query string support hama mapping ekktama
    //x-www -form data send krnn puluwn post mapping ekka witaryi
    @PostMapping

    public  String methOne(String id,String name,String address){
        System.out.println("methOne Invoke"+id);
        return "x-www-form";
    }
}
