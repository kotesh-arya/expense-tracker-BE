package com.expensetracker.restdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.jackson.JacksonProperties.Datatype;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.expensetracker.restdemo.entity.ExpenseDetails;
@Repository
public interface ExpenseDetailsRepository extends CrudRepository<ExpenseDetails, Integer> {
    List<ExpenseDetails> findAll();
 
    ExpenseDetails findById(int id);
}
