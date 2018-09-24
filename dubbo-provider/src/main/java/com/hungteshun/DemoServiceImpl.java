package com.hungteshun;

import org.springframework.stereotype.Service;

/**
 * @author hungteshun
 * @description:
 * @date 2018/9/23 21:19
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService{

    public String sayHello(String name) {
        return name;
    }
}
