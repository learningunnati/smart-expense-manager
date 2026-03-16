package com.smartexpense.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseCreatedEvent {

    private Long expenseId;
    private Long createdBy;
    private Double amount;
    private List<Long> participants;

}