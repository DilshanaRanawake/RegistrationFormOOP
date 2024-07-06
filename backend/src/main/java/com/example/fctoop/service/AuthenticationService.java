package com.example.fctoop.service;

import com.example.fctoop.dto.CustomerDetailDto;
import com.example.fctoop.entity.Customer;
import com.example.fctoop.model.LoginRequest;
import com.example.fctoop.model.RegisterRequest;
import com.example.fctoop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService {

    private CustomerRepository customerRepository;

    @Autowired
    public AuthenticationService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String login(LoginRequest loginRequest){
        return "You are successfully logged in";
    }
    public String register(RegisterRequest registerRequest){
        Customer customerA = new Customer(
                registerRequest.getEmail(),
                registerRequest.getName(),
                registerRequest.getContactNo()
        );

        customerRepository.save(customerA);

        //logic here
        return "You are registered successfully with the email of "+ registerRequest.getEmail();
    }

    public CustomerDetailDto getUserDetail(){
        Optional<Customer> customerOptional = customerRepository.findById(Long.valueOf(2));
        if (customerOptional.isPresent()){
            Customer customer= customerOptional.get();
            System.out.println(customer.getId());
            System.out.println(customer.getEmail());
            System.out.println(customer.getName());
            System.out.println(customer.getContactId());

            CustomerDetailDto customerDetailDto = new CustomerDetailDto(
                    customer.getEmail(),
                    customer.getName()
            );
            return customerDetailDto;
        }

        return null;
    }
}
