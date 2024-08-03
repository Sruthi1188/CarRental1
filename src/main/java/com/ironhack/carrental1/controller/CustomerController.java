package com.ironhack.carrental1.controller;

import com.ironhack.carrental1.model.CustomerModel;
import com.ironhack.carrental1.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor

public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<CustomerModel> findAll() {

        return customerService.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody @Valid CustomerModel customerModel) {
        customerService.create(customerModel.getFirstName(), customerModel.getLastName(), customerModel.getEmail());
    }
    @PutMapping("/{customerId}")
    public CustomerModel updateCustomer(@PathVariable ("customerId")Long customerId, @RequestBody @Valid CustomerModel customerModel) {
        return customerService.updateCustomer(customerId, customerModel);
    }

}
