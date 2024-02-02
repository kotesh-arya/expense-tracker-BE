package com.expensetracker.restdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensetracker.restdemo.entity.ExpenseDetails;
import com.expensetracker.restdemo.model.Expense;
import com.expensetracker.restdemo.repository.ExpenseDetailsRepository;

@RestController
@RequestMapping("/expense") // Denotes the context path
public class ExpenseAPIService {

    @Autowired
    private ExpenseDetailsRepository obj;

    @GetMapping("/all")
    public List<ExpenseDetails> getExpenseDatails() {
        // List<ExpenseDetails> myList = new ArrayList<>();
        List<ExpenseDetails> expenseDetailsList = (List<ExpenseDetails>) obj.findAll();
        return expenseDetailsList;

        // return obj.findAll();
        // new Expense("300", "shopping", "21/01/2024", "Pepe Jeans");
    }
    @GetMapping("/{id}")
    public ExpenseDetails getExpenseDetailsById(@PathVariable int id) {
        return  obj.findById(id);
               
    }

    @PostMapping
    public String createExpenseDetails(@RequestBody Expense expense) {
        return "Expense details created Successfully";
    }

    @PutMapping
    public String updateExpenseDetails(@RequestBody Expense expense) {
        return "Expense details Updated Successfully";
    }

    @DeleteMapping("{expenseAmount}")
    public String deleteExpenseDetails(String expenseAmount) {
        return "Expense details deleted Successfully";
    }

}
