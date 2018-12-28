package com.cts.cloud.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CloudConfigClientController {

	@Value("${greeting:hello}") 
	public String message;
	
	@RequestMapping("/config")
	public String welcome() {
		System.out.println("hello");
		return message;
		
	}
}
