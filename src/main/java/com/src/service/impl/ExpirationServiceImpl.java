package com.src.service.impl;
import com.src.entity.Expiration;
import com.src.mapper.ExpirationMapper;
import org.springframework.stereotype.Service;
import com.src.service.ExpirationService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service(value = "ExpirationService")
public class ExpirationServiceImpl implements ExpirationService {
    @Resource
    private ExpirationMapper expirationMapper;
    @Override
    public int insert(Expiration expiration) {
        return expirationMapper.insertSelective(expiration);
    }

    @Override
    public int update(Expiration expiration) {
        return expirationMapper.updateByPrimaryKeySelective(expiration);
    }

    @Override
    public Expiration selectByPrimaryKey(Long id) {
        return expirationMapper.selectByPrimaryKey(id);
    }
}
