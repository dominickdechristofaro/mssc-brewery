package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.CustomerDtoV1;

import java.util.UUID;

public interface CustomerServiceV1 {

    CustomerDtoV1 getCustomerById(UUID customerId);

    void deleteCustomerById(UUID customerId);

    void updateCustomerById(UUID customerId, CustomerDtoV1 customerDtoV1);

    CustomerDtoV1 createCustomer(CustomerDtoV1 customerDtoV1);
}
