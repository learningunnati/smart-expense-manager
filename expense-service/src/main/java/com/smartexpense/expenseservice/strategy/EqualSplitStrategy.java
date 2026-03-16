package com.smartexpense.expenseservice.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EqualSplitStrategy implements SplitStrategy {

    @Override
    public Map<Long, Double> split(Double amount, List<Long> participants) {

        Map<Long, Double> result = new HashMap<>();

        double share = amount / participants.size();

        for (Long user : participants) {
            result.put(user, share);
        }

        return result;
    }
}