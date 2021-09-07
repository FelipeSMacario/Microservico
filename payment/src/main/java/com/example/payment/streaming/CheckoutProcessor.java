package com.example.payment.streaming;

import org.hibernate.result.Output;

public interface CheckoutProcessor {

    String OUTPUT = "payment-paid-output";
    String INPUT = "checkout-created-input";

    @Output(OUTPUT)
    MessageChannel output();

    @Input(INPUT)
    SubscribableChannel input();
}
