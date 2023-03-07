package com.te.bootwithstreamtwo.service;

import java.util.List;

import com.te.bootwithstreamtwo.entity.Customer;
import com.te.bootwithstreamtwo.entity.Product;

public interface CustomerService {

	public Customer addCustomer(Customer customer);

	public List<Product> customerList();

}
