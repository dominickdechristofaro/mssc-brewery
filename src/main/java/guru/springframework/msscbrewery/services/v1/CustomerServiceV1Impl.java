package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.CustomerDtoV1;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceV1Impl implements CustomerServiceV1 {
    @Override
    public CustomerDtoV1 getCustomerById(UUID customerId) {
        return CustomerDtoV1.builder().id(UUID.randomUUID())
                .name("John Smith")
                .build();
    }

    @Override
    public void deleteCustomerById(UUID customerId) {

    }

    @Override
    public void updateCustomerById(UUID customerId, CustomerDtoV1 customerDtoV1) {

    }

    @Override
    public CustomerDtoV1 createCustomer(CustomerDtoV1 customerDtoV1) {
        return CustomerDtoV1.builder()
                .id(UUID.randomUUID())
                .name(customerDtoV1.getName())
                .build();
    }
}
