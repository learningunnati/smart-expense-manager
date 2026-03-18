package com.smartexpense.expenseservice.controller;

import com.smartexpense.expenseservice.entity.UserBalance;
import com.smartexpense.expenseservice.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/balances")
@RequiredArgsConstructor
public class BalanceController {

    private final ExpenseService expenseService;

    @GetMapping("/{userId}")
    public List<UserBalance> getBalance(@PathVariable Long userId) {

        return expenseService.getUserBalance(userId);

    }

}