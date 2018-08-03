package com.marsel;

import com.marsel.model.Product;
import com.marsel.repository.CustomerRepository;
import com.marsel.repository.OrderRepository;
import com.marsel.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Created by Marsel Hoxha on Agosto, 2018
 */
@SpringBootApplication
public class SpringCoffeeShopApplication implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;



    public static void main(String[] args) {
        SpringApplication.run(SpringCoffeeShopApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {

        Product caffe = new Product();
        caffe.setProductName("Espresso Coffee");
        caffe.setProductPrice(0.9);

        Product capuccinno = new Product();
        capuccinno.setProductName("Capuccinno");
        capuccinno.setProductPrice(1.2);

        productRepository.save(caffe);
        productRepository.save(capuccinno);



    }


}