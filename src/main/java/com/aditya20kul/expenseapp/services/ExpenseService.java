package com.aditya20kul.expenseapp.services;

import com.aditya20kul.expenseapp.models.Expense;
import com.aditya20kul.expenseapp.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense saveExpense(Expense expense) {
        expenseRepository.save(expense);
        return expense;
    }

    public Expense updateExpense(Expense expenseRequest, Long id) {
        Optional<Expense> expenseOptional = expenseRepository.findById(id);
        if(expenseOptional.isEmpty()) return new Expense();
        Expense expense = expenseOptional.get();
        expense.setExpenseDate(expenseRequest.getExpenseDate());
        expense.setExpenseTitle(expenseRequest.getExpenseTitle());
        expense.setExpenseCategory(expenseRequest.getExpenseCategory());
        expense.setExpenseDescription(expenseRequest.getExpenseDescription());
        return expenseRepository.save(expense);
    }
}
