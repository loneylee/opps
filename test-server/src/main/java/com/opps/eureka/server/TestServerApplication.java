package com.opps.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Jason on 5/4/16.
 */

@SpringBootApplication
public class TestServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TestServerApplication.class).web(true).run(args);
    }
}
