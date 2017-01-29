package main.java.com.petros.diplomatiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {


    @GetMapping("list")
    public String listCustomers() {
        return "customer-list";
    }
}
