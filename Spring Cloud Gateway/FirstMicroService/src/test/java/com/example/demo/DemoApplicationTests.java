package com.example.demo;

import com.example.demo.controller.FirstMicroServiceController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * The type Demo application tests.
 */
@ContextConfiguration(classes = {FirstMicroServiceController.class})
@ExtendWith(SpringExtension.class)
class DemoApplicationTests {

	@Autowired
	private FirstMicroServiceController customerController;

	/**
	 * Context loads.
	 */
//	@MockBean
//	private CustomerService customerService;
	@Test
	void testTest() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/microservice1/message");
		MockMvcBuilders.standaloneSetup(this.customerController)
				.build()
				.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
				.andExpect(MockMvcResultMatchers.content().string("This is first microservice"));
	}

	@Test
	void testTest2() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/microservice1/message", "Uri Vars");
		MockMvcBuilders.standaloneSetup(this.customerController)
				.build()
				.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
				.andExpect(MockMvcResultMatchers.content().string("This is first microservice"));
	}
	@Test
	void contextLoads() {

	}

}
