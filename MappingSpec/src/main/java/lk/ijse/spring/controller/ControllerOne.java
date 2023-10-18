package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class ControllerOne {

@GetMapping
    public String hello(){
    System.out.println("Okay:200");
    return "Get Mapping invoke";
}

@PostMapping
    public String saveNow(){
    System.out.println("Save Now");
    return "Save mapping invoke";
}

@DeleteMapping
    public String deleteNow(){
    return "Delete Mapping invoke";//need converters
}

@PutMapping
    public boolean updateNow(){
    return false;
}

}
