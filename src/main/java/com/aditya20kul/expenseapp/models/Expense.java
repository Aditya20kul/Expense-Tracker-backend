package com.aditya20kul.expenseapp.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    private UUID expenseId;
    private String expenseTitle;
    private String expenseDescription;
    private double amount;
    private LocalDateTime expenseDate;

}
