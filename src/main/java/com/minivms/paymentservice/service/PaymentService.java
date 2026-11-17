package com.minivms.paymentservice.service;

import com.minivms.paymentservice.model.dto.PaymentRequestDto;
import com.minivms.paymentservice.model.dto.PaymentResponseDto;

public interface PaymentService {

    PaymentResponseDto processPayment(PaymentRequestDto request);
    PaymentResponseDto getPayment(Long id);

}
