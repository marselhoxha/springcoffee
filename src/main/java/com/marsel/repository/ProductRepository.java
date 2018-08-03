package com.marsel.repository;

import com.marsel.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Marsel Hoxha on Agosto, 2018
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
