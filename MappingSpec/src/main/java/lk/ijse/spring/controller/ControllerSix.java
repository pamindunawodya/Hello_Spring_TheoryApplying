package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;


@RestController
@RequestMapping("/six")
public class ControllerSix {


    //There are two types for a request
        //01.headers(meta data) data format ek :application/json..
        //02.Body(Content)m
            //formats
            //Json
            //Query string
            //x-www-form-url-encoded(form data)

    //consumes types(what are the request hopes to consumes with request)
    //to match request sender shoud send Content-type header
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String testOne(){
        System.out.println("Media type okay");
        return "testOne invoked";
    }

    //produce  types(what are the request hopes to consumes with response)
    //to match request sender shoud send Accept header
    @GetMapping(produces = {"text/html"})
    public String testTwo(){
        System.out.println("Media type okay");
        return "testTwo invoked";
    }
}
