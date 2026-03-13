package com.smartexpense.expenseservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreateExpenseRequest {

    private String description;
    private Double amount;
    private Long createdBy;
    private List<Long> participants;

}