package com.demo.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@LocalServerPort
	private int port;
	
	@Autowired
    private TestRestTemplate restTemplate;
	
	
	
	@Test
	public void contextLoads() 
	{
		
	}

	@Test
	public void testDefaultMessafe()
	{
		String inputMessage = "Hello";
		
		String output = this.restTemplate.getForObject("http://localhost:"+port+"/hello?message="+inputMessage, String.class);
		
		assertEquals(inputMessage, output);
	}
	
}
