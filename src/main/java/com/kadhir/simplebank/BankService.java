package com.kadhir.simplebank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;

    public BankEntity deposit(BankEntity depositDetails) {

        return bankRepository.save(depositDetails);
    }
}
