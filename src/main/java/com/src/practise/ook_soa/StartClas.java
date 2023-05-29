package com.src.practise.ook_soa;



import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
/**
 * @author caojianbang
 * @date 2021/6/27 12:39
 */
@Configuration
public class StartClas {
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean(name = "wbsBean")
    public ServletRegistrationBean dispatcherServlet() {
        ServletRegistrationBean wbsServlet = new ServletRegistrationBean(new CXFServlet(), "/wbs/*");
        return wbsServlet;
    }

    @Bean
    public Endpoint endpointPurchase(SpringBus springBus, UserServiceSoa userService) {
        EndpointImpl endpoint = new EndpointImpl(springBus, userService);
        endpoint.publish("/user-server");
        System.out.println("服务发布成功！地址为：http://localhost:8080/wbs/user-server");
        return endpoint;
    }
}
