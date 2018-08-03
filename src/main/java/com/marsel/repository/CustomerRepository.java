package com.marsel.repository;

import com.marsel.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Marsel Hoxha on Agosto, 2018
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}