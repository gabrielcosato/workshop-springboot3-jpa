package com.educandoweb.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
}
