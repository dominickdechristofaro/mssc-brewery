package guru.springframework.msscbrewery.web.controller.v1;

import guru.springframework.msscbrewery.services.v1.CustomerServiceV1;
import guru.springframework.msscbrewery.web.model.v1.CustomerDtoV1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerControllerV1 {

    private final CustomerServiceV1 customerServiceV1;

    public CustomerControllerV1(CustomerServiceV1 customerServiceV1) {
        this.customerServiceV1 = customerServiceV1;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDtoV1> getCustomerById(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerServiceV1.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDtoV1> createCustomer(@RequestBody CustomerDtoV1 customerDtoV1) {
        return new ResponseEntity<>(customerServiceV1.createCustomer(customerDtoV1), HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomerById(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDtoV1 customerDtoV1) {
        customerServiceV1.updateCustomerById(customerId, customerDtoV1);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable("customerId") UUID customerId) {
        customerServiceV1.deleteCustomerById(customerId);
    }
}
