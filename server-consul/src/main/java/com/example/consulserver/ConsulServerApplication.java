package com.example.consulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class ConsulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulServerApplication.class, args);
	}

    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }
}
