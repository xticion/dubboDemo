package com.xticion.provider.orderService;

import com.xticion.springcloud.dubbo.orderService.OrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService
public class OrderServiceImpl implements OrderService {

    @Value("${server.port}")
    private String port;

    @Override
    public String getOrder(String msg) {
        return "SUCCESS GET FROM :" + port + msg;
    }

}
