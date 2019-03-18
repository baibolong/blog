package com.baibl.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.baibl.blog.config.AppConfig;
import com.baibl.blog.pojo.definition.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
	
	@Test
	public void testPerson() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//		Person person = ctx.getBean(BussinessPerson.class);//父类引用指向子类对象
		Person person = ctx.getBean(Person.class);
		person.service();
	}
}
