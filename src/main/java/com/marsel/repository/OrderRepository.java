package com.marsel.repository;

import com.marsel.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Marsel Hoxha on Agosto, 2018
 */
@Component
public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}
