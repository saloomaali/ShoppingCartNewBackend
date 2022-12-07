package com.Nest.ShoppingCart.dao;

import com.Nest.ShoppingCart.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products, Integer> {
}
