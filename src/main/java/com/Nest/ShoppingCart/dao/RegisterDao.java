package com.Nest.ShoppingCart.dao;

import com.Nest.ShoppingCart.model.Registration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegisterDao extends CrudRepository <Registration, Integer>{
    @Query(value = "SELECT `id`, `category`, `description`, `image`, `name`, `price` FROM `products` WHERE `name` = :name", nativeQuery = true)
    List<Registration> cardsearch();

}
