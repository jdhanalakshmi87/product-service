package com.wipro.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.product.client.CouponClient;
import com.wipro.product.dto.Coupon;
import com.wipro.product.entity.Product;
import com.wipro.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	    private final ProductService productService;
	    private final CouponClient couponClient;
 
	   // @Autowired
	   // private CouponClient couponClient;
	    public ProductController(ProductService productService,CouponClient couponClient) {
	        this.productService = productService;
	        this.couponClient = couponClient;
	    }

	    @PostMapping
	    public Product addProduct(@RequestBody Product product) {
	        return productService.addProduct(product);
	    }

	    @GetMapping
	    public List<Product> findAllProduct() {
	        return productService.findAllProduct();
	    }
	    

	    @GetMapping("/{id}")
	    public Product findProductById(@PathVariable Long id) {
	        return productService.findProductById(id);
	    }
	    @GetMapping("/coupon/{id}")
	    public Coupon getCoupon(@PathVariable Long id) {
	        return couponClient.findCouponById(id);
	    }

}
