package com.dspcontroles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dspcontroles.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
