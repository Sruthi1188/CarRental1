package com.ironhack.carrental1.service;

import com.ironhack.carrental1.model.CustomerModel;
import com.ironhack.carrental1.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;

    //view all customers
    public List<CustomerModel> findAll() {
        return customerRepository.findAll();
    }

    //add a customer
    public CustomerModel create(String firstName, String lastName, String email) {
        log.info("Add customer : {}", firstName);
        CustomerModel customerModel = new CustomerModel(firstName, lastName, email);
        return customerRepository.save(customerModel);
    }

    //update a customer
    public CustomerModel updateCustomer(Long customerId, CustomerModel customerModel) {
        log.info("Updating customer with id{}", customerId);
        var customerToUpdate = customerRepository.findById(customerId).orElseThrow();
        customerToUpdate.setEmail(customerModel.getEmail());
        return customerRepository.save(customerToUpdate);


    }
}
