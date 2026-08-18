package com.wipro.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.product.dto.Coupon;

@FeignClient(name = "coupon-service")

public interface CouponClient {

	@GetMapping("/coupons/{id}")
    Coupon findCouponById(@PathVariable("id") Long id);
}
