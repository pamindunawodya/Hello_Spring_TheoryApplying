package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping
    public CustomerDTO testOne(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.getName());
       System.out.println(customerDTO.getAddress());
       System.out.println(customerDTO.getSalary());
        return customerDTO;
    }

    @GetMapping
    public ArrayList<CustomerDTO> testTwo() {
        ArrayList<CustomerDTO> customers = new ArrayList<>();
        customers.add(new CustomerDTO("amal", "Horana", 5000.00));
        return customers;
    }

}
