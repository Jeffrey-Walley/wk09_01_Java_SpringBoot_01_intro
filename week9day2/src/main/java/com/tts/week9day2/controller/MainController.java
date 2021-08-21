package com.tts.week9day2.controller;

import com.tts.week9day2.model.Customer;
import com.tts.week9day2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;


// RestController is a Stereotype annotation that denotes
// specific behaviors regarding web request and responses
@RestController
public class MainController {

    @Autowired
    CustomerRepository customerRepository;


     // tells Spring to come here and resolve this method when we reach   localhost:8080
      // this is routing information -- routers resolve @ a specified point
   // @GetMapping("/")
   //  public String getHome() {                              // method 'getHome()'
    //    return "Hello world";
   // }

    // return a separate address that is not on '/'
     // this method showcases that endpoints render dynamic data
      // the number that a this endpoint will be unique due to the 'Random' class
    @GetMapping("/random")
    public Integer getRandomInteger() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    // lets get all customers from our database
    @GetMapping("/customer/all")
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }


    // this mapping has a dynamic element
    // the dynamic element is the 'path variable'
    // while it is bound to a parameter the literal value
    // is completely dynamic   -- we can now get by id  ex: localhost:8080/customer/1  -will return Johnny Walker in our database

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        // get the value inside my "optional" if there is nothing there, then throw an exception
        return customerRepository.findById(id).orElseThrow();

    }
    }
