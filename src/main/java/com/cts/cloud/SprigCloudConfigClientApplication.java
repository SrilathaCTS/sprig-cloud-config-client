package com.cts.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SprigCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprigCloudConfigClientApplication.class, args);
	}

}
 
