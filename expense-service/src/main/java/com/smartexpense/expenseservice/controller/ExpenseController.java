package com.smartexpense.expenseservice.controller;

import com.smartexpense.expenseservice.dto.CreateExpenseRequest;
import com.smartexpense.expenseservice.entity.Expense;
import com.smartexpense.expenseservice.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping
    public Expense createExpense(@RequestBody CreateExpenseRequest request) {
        return expenseService.createExpense(request);
    }

}