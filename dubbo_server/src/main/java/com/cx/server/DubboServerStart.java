package com.cx.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description dubbo服务注册者启动
 * @Author wb.yang
 * @Date 2019/3/16 9:49
 */
public class DubboServerStart {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
			context.start();
		} catch (Exception e) {
		}
		synchronized (DubboServerStart.class) {
			while (true) {
				try {
					DubboServerStart.class.wait();
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
