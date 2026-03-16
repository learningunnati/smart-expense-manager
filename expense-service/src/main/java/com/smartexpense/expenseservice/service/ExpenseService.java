package com.smartexpense.expenseservice.service;

import com.smartexpense.events.ExpenseCreatedEvent;
import com.smartexpense.expenseservice.dto.CreateExpenseRequest;
import com.smartexpense.expenseservice.entity.Expense;
import com.smartexpense.expenseservice.entity.UserBalance;
import com.smartexpense.expenseservice.event.ExpenseEventProducer;
import com.smartexpense.expenseservice.repository.ExpenseRepository;
import com.smartexpense.expenseservice.repository.UserBalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ExpenseEventProducer producer;
    private final UserBalanceRepository userBalanceRepository;

    public Expense createExpense(CreateExpenseRequest request) {

        Expense expense = Expense.builder()
                .description(request.getDescription())
                .amount(request.getAmount())
                .createdBy(request.getCreatedBy())
                .createdAt(LocalDateTime.now())
                .build();

        Expense savedExpense = expenseRepository.save(expense);
        ExpenseCreatedEvent event =
                new ExpenseCreatedEvent(
                        savedExpense.getId(),
                        savedExpense.getCreatedBy(),
                        savedExpense.getAmount(),
                        request.getParticipants()
                );

        producer.publishExpenseCreatedEvent(event);


        return savedExpense;
    }

}