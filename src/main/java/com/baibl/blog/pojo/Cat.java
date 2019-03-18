package com.baibl.blog.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.baibl.blog.pojo.definition.Animal;
@Component
@Primary
public class Cat implements Animal {

	@Override
	public void use() {
		System.out.println("猫【"+ Cat.class.getSimpleName() +"】是抓老鼠用的。");

	}

}
