package com.src.service;

import com.src.entity.Expiration;

public interface ExpirationService {
    public int insert(Expiration expiration);

    public int update(Expiration expiration);

    Expiration  selectByPrimaryKey(Long id);

}
