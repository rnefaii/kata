package com.carrefour.customerservice.mapper;

import com.carrefour.customerservice.dto.CustomerDTO;
import com.carrefour.customerservice.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toDTO(Customer customer);
    Customer toEntity(CustomerDTO dto);
}