package com.abhisek.audit4j.poc.controller.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.abhishek.audit4j.poc.application.Application;
import com.abhishek.audit4j.poc.application.GreetingController;

/**
 * 
 * @author Abhishek Bhardwaj
 * @date May 6, 2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class GreetingControllerTest {

	@Autowired
	private GreetingController greetingController;

	@Test
	public void test() {
		// greetingController.hello();
		greetingController.foo1("e1", "e2");
		greetingController.foo2("f1", "f2");
	}

}
