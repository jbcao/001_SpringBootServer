package com.src.practise.ook_soa;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author caojianbang
 * @date 2021/6/27 12:42
 */

@WebService
public interface UserServiceSoa {
    String sayHello(@WebParam(name = "userId") String userId, @WebParam(name = "userName") String userName);
}
