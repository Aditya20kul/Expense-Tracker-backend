package com.aditya20kul.expenseapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/expense")
public class expenseController {
    @GetMapping
    public String sayHello(){
        return "Expense App";
    }
}
