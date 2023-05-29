package com.src.practise.ooc_mybatis_connectivity;

public interface TMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMember record);

    int insertSelective(TMember record);

    TMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMember record);

    int updateByPrimaryKey(TMember record);
}