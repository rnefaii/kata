package com.carrefour.customerservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private String driverLicenseNumber;
    private boolean active;
}
