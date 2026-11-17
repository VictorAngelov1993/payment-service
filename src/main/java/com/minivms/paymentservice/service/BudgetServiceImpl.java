package com.minivms.paymentservice.service;

import com.minivms.paymentservice.model.dto.BudgetResponseDto;

import java.math.BigDecimal;
import java.util.UUID;

public class BudgetServiceImpl implements BudgetService{

    @Override
    public BudgetResponseDto addBudget(UUID buyerUuid, BigDecimal amount) {
        return null;
    }
}
