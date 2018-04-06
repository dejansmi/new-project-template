
package com.dejans.${name};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ${name}Application {

	public static void main(String[] args) {
		SpringApplication.run(${name}Application.class, args);
	}
}
