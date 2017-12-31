package com.basant.order.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {

	@GetMapping("/order-now/{price}")
	public String orderNow(@PathVariable long price) {
		return "Hi user, your order placed successfully with MRP$ :" + price;

	}

}
