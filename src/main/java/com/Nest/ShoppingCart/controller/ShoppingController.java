package com.Nest.ShoppingCart.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/register")
    public String registerUser(){

        return "register page";
    }



}
