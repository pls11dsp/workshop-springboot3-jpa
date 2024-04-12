package com.dspcontroles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dspcontroles.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
