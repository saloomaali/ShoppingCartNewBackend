package com.Nest.ShoppingCart.controller;

import com.Nest.ShoppingCart.dao.ProductDao;
import com.Nest.ShoppingCart.dao.RegisterDao;
import com.Nest.ShoppingCart.model.Products;
import com.Nest.ShoppingCart.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    private RegisterDao dao1;
    private ProductDao dao2;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/register",consumes = "application/json", produces = "application/json")
    public HashMap<String,String> registerUser(@RequestBody Registration r){

        dao1.save(r);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");

        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json", produces = "application/json")
    public HashMap<String, String> addProduct(@RequestBody Products p){

        dao2.save(p);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");

        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/view",consumes = "application/json", produces = "application/json")
    public List<Products> viewProduct(){

        return (List<Products>) dao2.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json", produces = "application/json")
    public String searchProduct(){

        return "search page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/cardView",consumes = "application/json", produces = "application/json")
    public List<Products> cardView(){

        return (List<Products>) dao2.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/cardSearch",consumes = "application/json", produces = "application/json")
    public String cardSearch(){

        return "card search page";
    }




}
