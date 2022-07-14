package com.pos.kuppiya.pointofsale.controller;

import com.pos.kuppiya.pointofsale.dto.CustomerDTO;
import com.pos.kuppiya.pointofsale.service.CustomerService;
import com.pos.kuppiya.pointofsale.service.impl.CustomerServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/test")
@CrossOrigin // catchup the request whatever the server came from
public class CustomerController
{

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/get1")
    public String getmytext()
    {
        String mytext="this is our first project";
        System.out.println(mytext);
        return mytext;

    }


    @PostMapping(path = "/save")
    public CustomerDTO saveCustomer (@RequestBody CustomerDTO customerDTO)
    {
        CustomerServiceIMPL customerServiceIMPL = new CustomerServiceIMPL();
        String id = customerService.addCustomer(customerDTO);
        return null;
    }
}
