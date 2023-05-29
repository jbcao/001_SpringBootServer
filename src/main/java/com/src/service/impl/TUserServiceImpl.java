package com.src.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.src.entity.TUser;
import com.src.mapper.TUserMapper;
import com.src.service.TUserService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "TUserService")
public class TUserServiceImpl implements TUserService {

	@Resource
	private TUserMapper tUserMapper;

	@Override
	public int  insert(TUser user) {
		return tUserMapper.insertSelective(user);
	}

	@Override
	public int update(TUser user) {
		return tUserMapper.updateByPrimaryKeySelective(user);
	}

}
