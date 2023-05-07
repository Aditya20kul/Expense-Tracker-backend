package com.aditya20kul.expenseapp.controller;

import com.aditya20kul.expenseapp.models.Expense;
import com.aditya20kul.expenseapp.repository.ExpenseRepository;
import com.aditya20kul.expenseapp.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @GetMapping("{id}")
    public Optional<Expense> getExpenseById(@PathVariable("id") Long id){
        return expenseRepository.findById(id);
    }

    @PostMapping
    public Expense saveExpense(@RequestBody Expense expense){
        return expenseService.saveExpense(expense);
    }

    @PatchMapping
    public Expense updateExpense(@RequestBody Expense expense){
        return expenseService.updateExpense(expense, expense.getId());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteExpense(@PathVariable("id") Long id){
         expenseRepository.deleteById(id);
         return new ResponseEntity<>("Expense deleted successfully!", HttpStatus.OK);
    }
}
