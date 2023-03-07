package com.te.bootwithstreamtwo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.bootwithstreamtwo.entity.Customer;
import com.te.bootwithstreamtwo.entity.Product;
import com.te.bootwithstreamtwo.repository.CustomerDAO;

@Service
public class CustomersImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerDAO.save(customer);
	}

	@Override
	public List<Product> customerList() {
		return null;
	}

}
