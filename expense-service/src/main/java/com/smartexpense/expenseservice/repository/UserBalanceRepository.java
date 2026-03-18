package com.smartexpense.expenseservice.repository;

import com.smartexpense.expenseservice.entity.UserBalance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserBalanceRepository extends JpaRepository<UserBalance, Long> {

    List<UserBalance> findByUserId(Long userId);

}