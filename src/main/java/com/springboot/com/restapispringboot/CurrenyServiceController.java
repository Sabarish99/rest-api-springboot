package com.springboot.com.restapispringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrenyServiceController {

    @Autowired
    CurrenyService currenyService;

    @RequestMapping("/currencyservice")
    public CurrenyService getList()
    {
        return currenyService;
    }
}
