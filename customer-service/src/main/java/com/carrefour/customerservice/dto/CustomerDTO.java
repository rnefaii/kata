package com.carrefour.customerservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDTO {
    private String id;
    private String brand;
    private String model;
    private boolean available;
}
