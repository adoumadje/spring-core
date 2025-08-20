package com.adoumadje.springboot;

import com.adoumadje.springboot.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootApplicationTests {
	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testService() {
		Service service = applicationContext.getBean(Service.class);
		service.create();
	}

}
