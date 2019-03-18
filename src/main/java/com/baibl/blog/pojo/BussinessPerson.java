package com.baibl.blog.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.baibl.blog.pojo.definition.Animal;
import com.baibl.blog.pojo.definition.Person;

@Component
public class BussinessPerson implements Person {
	
	@Autowired
	@Qualifier("dog")
	private Animal animal = null;
	
	@Override
	public void service() {
		this.animal.use();
	}

	@Override
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
