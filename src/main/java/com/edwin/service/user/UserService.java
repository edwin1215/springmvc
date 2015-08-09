package com.edwin.service.user;

import com.edwin.domain.user.User;

public class UserService {

	public User getUserInfo(String userNo) {
		return new User(userNo);
	}
}
