package com.smartexpense.expenseservice.repository;

import com.smartexpense.expenseservice.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}