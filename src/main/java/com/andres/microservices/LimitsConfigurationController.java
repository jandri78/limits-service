package com.andres.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitsConfiguration retrivelimitisFromConfigurations() {
	
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
