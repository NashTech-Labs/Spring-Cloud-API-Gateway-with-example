package com.example.MicroService2;

import com.example.MicroService2.Controller.Controller;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * The type Demo application tests.
 */
@ContextConfiguration(classes = {Controller.class})
@ExtendWith(SpringExtension.class)
class DemoApplicationTests {

	@Autowired
	private Controller customerController;

	/**
	 * The type Micro service 2 application tests.
	 * @throws Exception
	 */
		@Test
		void testTest() throws Exception {
			MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/microservice2/message");
			MockMvcBuilders.standaloneSetup(this.customerController)
					.build()
					.perform(requestBuilder)
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
					.andExpect(MockMvcResultMatchers.content().string("This is second microservice"));
		}

		@Test
		void testTest2() throws Exception {
			MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/microservice2/message", "Uri Vars");
			MockMvcBuilders.standaloneSetup(this.customerController)
					.build()
					.perform(requestBuilder)
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
					.andExpect(MockMvcResultMatchers.content().string("This is second microservice"));
		}
		@Test
	void contextLoads() {
	}

}