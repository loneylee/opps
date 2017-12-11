package com.opps.eureka.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lishuai on 2017/12/11.
 */
@RestController
public class ConfigServerTestController {
//    @Value("${from}")
//    private String from;

    @RequestMapping(value = "/from")
    public String from() {

        return "";
    }
}
