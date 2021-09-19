package com.example.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * 想要远程调用别的服务
 * 1.引用open-figen
 * 2.编写一个接口,告诉springCloud这个接口需要调用远程服务
 *  2.1声明接口的每一个方法是调用哪个远程服务哪个请求
 * 3.开启远程调用功能
 */
@EnableFeignClients(basePackages = "com.example.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
