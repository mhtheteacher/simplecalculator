package com.myapis.basicoperations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
@RestController
//@Path("/subtraction")

public class BasicOperationsController {
    
    @GetMapping("/welcome")
   // @Produces(MediaType.TEXT_PLAIN)
    public String welcome() {
        return "Welcome to the Mathematical Basic Operations API!";
    }

    @GetMapping("/subtract/{num1}/{num2}")
    public String subtract(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        int diff = num2 - num1;
        return "The difference of " + num2 + " and " + num1 + " is " + diff;
    }

    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        int sum = num2 + num1;
        return "The sum of " + num2 + " and " + num1 + " is " + sum;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public String multiply(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        int multiple = num2 * num1;
        return "The product of " + num2 + " and " + num1 + " is " + multiple;
    }
}
