package com.pos.kuppiya.pointofsale.service.impl;

import com.pos.kuppiya.pointofsale.dto.CustomerDTO;
import com.pos.kuppiya.pointofsale.entity.Customer;
import com.pos.kuppiya.pointofsale.repo.CustomerRepo;
import com.pos.kuppiya.pointofsale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class CustomerServiceIMPL implements CustomerService
{

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerid(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomeradress(),
                customerDTO.getCustomersalary(),
                customerDTO.getContactnumber(),
                customerDTO.getNic(),
                customerDTO.isActivestate()
);
        return null;
    }

}
