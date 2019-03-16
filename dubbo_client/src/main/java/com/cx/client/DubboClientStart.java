package com.cx.client;

import com.cx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description dubbo服务消费者启动
 * @Author wb.yang
 * @Date 2019/3/16 9:38
 */
public class DubboClientStart {

	public static void main(String[] args) {
		//加载spring配置
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
		//获取userService对象
		UserService userService = (UserService) context.getBean("userService");
		//调用方法
		String userName = userService.getUserName();
		System.out.println(userName);
		userService.saveUserName("name");
		Integer age = userService.combinedAge(15, 12);
		System.out.println(age);
	}
}
