package com.Nest.ShoppingCart.controller;

import com.Nest.ShoppingCart.model.Products;
import com.Nest.ShoppingCart.model.Registration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/register")
    public String registerUser(@RequestBody Registration r){

        System.out.println(r.getName());

        return "register page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add")
    public String addProduct(@RequestBody Products p){

        System.out.println(p.getName());

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
