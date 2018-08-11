package com.example.serviceImp;

import com.example.daoImpl.UserDAOImpl;
import com.example.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public String getNameById(int id) {
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		return userDAOImpl.getNameById(id);
	}

}
