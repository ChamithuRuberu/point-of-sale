package com.pos.kuppiya.pointofsale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
@CrossOrigin // catchup the request whatever the server came from
public class TestController
{
    @GetMapping(path = "/get1")
    public String getmytext()
    {
        String mytext="this is our first project";
        System.out.println(mytext);
        return mytext;

    }
}
