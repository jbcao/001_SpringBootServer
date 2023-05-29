package com.src.practise.ook_soa;

/**
 * @author caojianbang
 * @date 2021/6/27 12:43
 */
import com.src.practise.ook_soa.UserServiceSoa;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(targetNamespace="http://ook_soa.practise.src.com/",endpointInterface = "com.src.practise.ook_soa.UserServiceSoa")
public class UserServiceSoaImpl implements UserServiceSoa {
    @Override
    public String sayHello(String userId, String userName) {
        return "say hello || userId = "+ userId + "|| userName = "+ userName;
    }


}
