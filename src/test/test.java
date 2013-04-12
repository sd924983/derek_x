package test;

import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.blog.model.user.User;
import cn.blog.service.ObjectService;

public class test {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


	}

}
