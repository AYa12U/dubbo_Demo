package com.cx.service;

/**
 * @Description 用户service
 * @Author wb.yang
 * @Date 2019/3/16 9:09
 */
public interface UserService {

	/**
	 * 获取用户名
	 * @return 用户名
	 */
	String getUserName();


	/**
	 * 添加用户名
	 * @param name 用户名
	 */
	void saveUserName(String name);


	/**
	 * 获取两个年龄的总和
	 * @param age1 年龄1
	 * @param age2 年龄2
	 * @return 年龄总和
	 */
	Integer  combinedAge(Integer age1 , Integer age2);
}
