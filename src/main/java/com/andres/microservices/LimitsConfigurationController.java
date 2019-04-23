package com.andres.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitsConfiguration retrivelimitisFromConfigurations() {
	
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	

	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod = "fallbackRetriveConfigurations")
	public LimitsConfiguration retriveConfigurations() {
	
		throw new RuntimeException("Not avaiable");
	}
	
	
	public LimitsConfiguration fallbackRetriveConfigurations()
	{
		return new LimitsConfiguration(9999,99);
		
	}	
	
}
