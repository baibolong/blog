package com.baibl.blog.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.baibl.blog.pojo.definition.Animal;

@Component

public class Dog implements Animal {

	@Override
	public void use() {
		System.out.println("狗【"+ Dog.class.getSimpleName() +"】是看门用的。");
	}

}
