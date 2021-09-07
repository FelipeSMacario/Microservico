package com.example.payment.config;

import com.example.payment.streaming.CheckoutProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBidding(CheckoutProcessor.class)
public class StreamingConfig {

}
