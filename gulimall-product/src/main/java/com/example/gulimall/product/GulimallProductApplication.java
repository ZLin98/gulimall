package com.example.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.整合mybatis plus
 *  1.1 导入依赖
 *  1.2 配置
 *      1.2.1 配置数据源
 *          导入数据库驱动
 *          在application.yml 文件中配置数据库相关信息
 *      1.2.2 配置mybatis plus
 *          使用mapperScan扫描
 *          xml 映射文件地址
 */
@MapperScan("com.example.gulimall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
