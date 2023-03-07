package com.te.bootwithstreamtwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.bootwithstreamtwo.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long> {

}
