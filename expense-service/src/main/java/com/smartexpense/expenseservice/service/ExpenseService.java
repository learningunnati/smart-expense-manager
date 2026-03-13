package com.smartexpense.expenseservice.service;

import com.smartexpense.expenseservice.dto.CreateExpenseRequest;
import com.smartexpense.expenseservice.entity.Expense;
import com.smartexpense.expenseservice.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public Expense createExpense(CreateExpenseRequest request) {

        Expense expense = Expense.builder()
                .description(request.getDescription())
                .amount(request.getAmount())
                .createdBy(request.getCreatedBy())
                .createdAt(LocalDateTime.now())
                .build();

        return expenseRepository.save(expense);
    }

}