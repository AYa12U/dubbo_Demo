package com.cx.server;

import com.cx.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description 用户service实现
 * @Author wb.yang
 * @Date 2019/3/16 9:33
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public String getUserName() {
		return "admin";
	}

	@Override
	public void saveUserName(String name) {
		System.out.println("用户名 ========>>>>>   " + name);
	}

	@Override
	public Integer combinedAge(Integer age1, Integer age2) {
		return age1 + age2;
	}
}
