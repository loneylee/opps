package com.opps.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Jason on 5/3/16.
 */
@MapperScan("com.opps.provider.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class Provider01Application {


    public static void main(String[] args) {
        new SpringApplicationBuilder(Provider01Application.class).run(args);
    }
}
