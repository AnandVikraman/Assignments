package com.te.bootwithstreamtwo.service;

import java.util.List;
import java.util.Map;

import com.te.bootwithstreamtwo.entity.Customer;
import com.te.bootwithstreamtwo.entity.Order;
import com.te.bootwithstreamtwo.entity.Product;

public interface OrderService {

	public Order addOrder(Order order);

	public List<Order> orderList(String category);

	public List<Product> getOrdersByCustomer();
	
	public List<Order> getRecent();
	
	public List<Product> getOrderLog();
	
	public Double lumpSum();
	
	public Double dayAverage();
	
	public Map<Long, Integer> obtainMap();
	
	public Map<Customer, List<Order>> mapCustomer();
	
	public Map<Order, Double> mapProductSum();

}
