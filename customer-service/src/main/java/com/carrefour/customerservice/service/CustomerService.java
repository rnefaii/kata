package com.carrefour.customerservice.service;

import com.carrefour.customerservice.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(String id);
    CustomerDTO createCustomer(CustomerDTO customer);
}
