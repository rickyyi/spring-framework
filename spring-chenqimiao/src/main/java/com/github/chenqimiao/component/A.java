package com.github.chenqimiao.component;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Auther: chenqimiao
 * @Date: 2019/11/7 15:23
 * @Description:
 */
@Component
//@Scope("singleton")
public class A {


	public void printB(){
		System.out.println(getClassB());
	}

	@Lookup
	public B getClassB(){
		return null;
	}

	public void voidMethod(){

	}
	@PostConstruct
	public void a(){
		System.out.println("Call A PostConstruct Method");
	}
}