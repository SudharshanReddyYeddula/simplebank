package com.kadhir.simplebank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BankController {

    @Autowired
    BankService bankService;

    @PostMapping("/depositDetails")
    public BankEntity  deposit(@RequestBody BankEntity depositDetails){

       return bankService.deposit(depositDetails);

    }


}
