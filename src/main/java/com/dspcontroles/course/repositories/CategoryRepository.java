package com.dspcontroles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dspcontroles.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
