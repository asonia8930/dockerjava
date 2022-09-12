package com.dockerdemo.controller;


import com.dockerdemo.request.CustomerRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "*")
@RestController
public class CustomerController {


    @GetMapping(value = "/hello", produces = "application/json",headers = "accept=application/json")
    public ResponseEntity<String> returnCustomerData() {
        String response = "hello";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping(value="/submitCustomer", produces = "application/json", headers="accept=application/json")
    public ResponseEntity<String> submitCustomer(@RequestBody CustomerRequest request) throws Exception{

        String response = "ok";

        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
