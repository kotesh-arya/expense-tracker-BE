package com.expensetracker.restdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensetracker.restdemo.model.Expense;

@RestController
@RequestMapping("/expense")
public class ExpenseAPIService {
    Expense expense;

    @GetMapping("{expenseAmount}")
    public Expense getExpenseDatails(String amount) {
        return expense;
        // new Expense("300", "shopping", "21/01/2024", "Pepe Jeans");
    }

    @PostMapping
    public String createExpenseDetails(@RequestBody Expense expense) {
        this.expense = expense;
        return "Expense details created Successfully";
    }

    @PutMapping
    public String updateExpenseDetails(@RequestBody Expense expense) {
        this.expense = expense;
        return "Expense details Updated Successfully";
    }

    @DeleteMapping("{expenseAmount}")
    public String deleteExpenseDetails(String expenseAmount) {
        this.expense = null;
        return "Expense details deleted Successfully";
    }
}
