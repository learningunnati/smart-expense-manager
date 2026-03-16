package com.smartexpense.expenseservice.event;

import com.smartexpense.events.ExpenseCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExpenseEventProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void publishExpenseCreatedEvent(ExpenseCreatedEvent event) {

        kafkaTemplate.send("expense-created-topic", event);

    }

}