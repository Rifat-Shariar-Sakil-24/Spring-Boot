package com.shariar.springboot.demo.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String Hello(){
      return "Hello World";
    }

    @GetMapping("/checkout")
    public String Checkout(){
        return "Checkout proceeding";
    }


}
