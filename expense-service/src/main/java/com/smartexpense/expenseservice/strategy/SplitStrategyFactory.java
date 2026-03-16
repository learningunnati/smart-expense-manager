package com.smartexpense.expenseservice.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SplitStrategyFactory {

    private final EqualSplitStrategy equalSplitStrategy;

    public SplitStrategy getStrategy(String type) {

        if ("EQUAL".equals(type)) {
            return equalSplitStrategy;
        }

        throw new RuntimeException("Unsupported split type");
    }

}