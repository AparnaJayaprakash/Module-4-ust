package com.example.demo.AwsRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.AwsResource.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
