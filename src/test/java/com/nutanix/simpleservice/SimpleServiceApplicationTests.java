package com.nutanix.simpleservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleServiceApplicationTests {

	@Autowired
	GreetingController greetingController;

	@Autowired
	HealthCheckController healthCheckController;

	@Autowired
	VersionController versionController;

	@Test
	void contextLoads() {
	}

}
