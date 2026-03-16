package com.smartexpense.expenseservice.strategy;

import java.util.List;
import java.util.Map;

public interface SplitStrategy {

    Map<Long, Double> split(Double amount, List<Long> participants);

}