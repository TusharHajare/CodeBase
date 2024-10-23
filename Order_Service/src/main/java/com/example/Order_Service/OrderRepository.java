package com.example.Order_Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>
{

}
