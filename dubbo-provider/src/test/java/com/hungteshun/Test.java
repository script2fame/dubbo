package com.hungteshun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author hungteshun
 * @description:
 * @date 2018/9/23 21:35
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        System.out.println("Dubbo provider start...");
        try {
            System.in.read();    // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
