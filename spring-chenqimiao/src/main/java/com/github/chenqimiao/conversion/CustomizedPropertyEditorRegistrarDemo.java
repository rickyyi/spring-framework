package com.github.chenqimiao.conversion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: chenqimiao
 * @Date: 2020/5/29 14:06
 * @Description:
 */
public class CustomizedPropertyEditorRegistrarDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/conversion/customized-property-editor-registrar.xml");


		User user = context.getBean("user", User.class);
		System.out.println(user);

		context.close();

	}
}
