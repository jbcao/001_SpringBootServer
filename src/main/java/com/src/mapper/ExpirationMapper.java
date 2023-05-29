package com.src.mapper;

import com.src.entity.Expiration;
//使用逆向工程，前要删除原来mapper.xml，否则会造成重复
public interface ExpirationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Expiration record);

    int insertSelective(Expiration record);

    Expiration selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Expiration record);

    int updateByPrimaryKey(Expiration record);
}