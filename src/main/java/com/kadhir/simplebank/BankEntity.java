package com.kadhir.simplebank;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankEntity {

    @Id
    private Long bankAccountNumber;
    private Long customerId;
    private String customerName;
    private Double balance;
}
/*
Json object from Postman/Insomania
{
    "bankAccountNumber":"";
    "customerId":"";
    "customerName":"";
    "balance":""

        }*/
