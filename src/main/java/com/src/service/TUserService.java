package com.src.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.src.entity.TUser;

public interface TUserService {
	public int insert(TUser user);

	public int update(TUser user);

}
