package com.smartexpense.notificationservice.event;

import com.smartexpense.events.ExpenseCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ExpenseEventConsumer {

    @KafkaListener(
            topics = "expense-created-topic",
            groupId = "notification-group"
    )
    public void consume(ExpenseCreatedEvent event) {

        System.out.println("Expense event received: " + event);

        // Example notification logic
        event.getParticipants().forEach(userId -> {
            System.out.println("Notify user " + userId + " about expense " + event.getExpenseId());
        });

    }

}