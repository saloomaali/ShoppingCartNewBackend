package com.Nest.ShoppingCart.controller;

import com.Nest.ShoppingCart.dao.ProductDao;
import com.Nest.ShoppingCart.dao.RegisterDao;
import com.Nest.ShoppingCart.model.Products;
import com.Nest.ShoppingCart.model.Registration;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    private RegisterDao dao1;

    @Autowired
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
    @GetMapping(path = "/view",consumes = "application/json", produces = "application/json")
    public List<Products> viewProduct(){

        return (List<Products>) dao2.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json", produces = "application/json")
    public List<Products> searchProduct(@RequestBody Products p){

        return (List<Products>) dao2.searchProduct(p.getName());
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/cardView",consumes = "application/json", produces = "application/json")
    public List<Products> cardView(){

        return (List<Products>) dao2.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/cardSearch",consumes = "application/json", produces = "application/json")
    public List<Products> cardSearch(@RequestBody Products p){

        return (List<Products>) dao2.searchProduct(p.getName());
    }




}
