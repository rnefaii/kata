package com.carrefour.customerservice.service.impl;

import com.carrefour.customerservice.dto.CustomerDTO;
import com.carrefour.customerservice.exception.CustomerNotFoundException;
import com.carrefour.customerservice.mapper.CustomerMapper;
import com.carrefour.customerservice.model.Customer;
import com.carrefour.customerservice.repository.CustomerRepository;
import com.carrefour.customerservice.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(customerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomerById(String id) {
        return customerRepository.findById(id)
                .map(customerMapper::toDTO)
                .orElseThrow(() -> new CustomerNotFoundException(id));
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = customerMapper.toEntity(customerDTO);
        customer.setAvailable(true);
        return customerMapper.toDTO(customerRepository.save(customer));
    }

}