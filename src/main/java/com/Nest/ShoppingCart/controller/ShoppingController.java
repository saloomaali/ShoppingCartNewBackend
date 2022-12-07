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
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add")
    public String addProduct(){

        return "add page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/view")
    public String viewProduct(){

        return "view page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search")
    public String searchProduct(){

        return "search page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/cardView")
    public String cardView(){

        return "card view page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/cardSearch")
    public String cardSearch(){

        return "card search page";
    }




}
