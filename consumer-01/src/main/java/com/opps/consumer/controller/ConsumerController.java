package com.opps.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.opps.consumer.entity.User;
import com.opps.consumer.request.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jason on 5/10/16.
 */
@RestController
@RequestMapping("/user")
public class ConsumerController {
//    private final static String PROVIDER_URL = "http://provider01/";
//
//    @Autowired
//    @LoadBalanced
//    private RestTemplate rt;
//
//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    @HystrixCommand(fallbackMethod = "deleteFallback")
//    public Result<Integer> deleteByPrimaryKey(@PathVariable String id) {
//        ResponseEntity<Result> resultEntity = rt.exchange(PROVIDER_URL + "user/" + id, HttpMethod.DELETE, null, Result.class);
//        return resultEntity.getBody();
//    }
//
//    @RequestMapping(method = RequestMethod.PUT)
//    @HystrixCommand(fallbackMethod = "insertFallback")
//    public Result<Integer> insert(@RequestBody User record) {
//        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(type);
//        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
//        HttpEntity<User> formEntity = new HttpEntity<User>(record, headers);
//        ResponseEntity<Result> resultEntity = rt.exchange(PROVIDER_URL + "user", HttpMethod.PUT, formEntity, Result.class);
//        return resultEntity.getBody();
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.GET)
//    @HystrixCommand(fallbackMethod = "selectByPrimaryKeyFallback")
//    public Result<User> selectByPrimaryKey(@PathVariable String id) {
//        return rt.getForObject(PROVIDER_URL + "user/" + id, Result.class);
//    }
//
//
//    @RequestMapping(method = RequestMethod.POST)
//    @HystrixCommand(fallbackMethod = "updateByPrimaryKeyFallback")
//    public Result<Integer> updateByPrimaryKey(@RequestBody User record) {
//        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(type);
//        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
//        HttpEntity<User> formEntity = new HttpEntity<User>(record, headers);
//
//        return rt.postForObject(PROVIDER_URL + "user", formEntity, Result.class);
//    }
//
//    private Result<Integer> updateByPrimaryKeyFallback(User record) {
//        return Result.msg("Hystrix Error: Update");
//    }
//
//    private Result<User> selectByPrimaryKeyFallback(String id) {
//        return Result.msg("Hystrix Error: Query");
//    }
//
//    private Result<Integer> insertFallback(User record) {
//        return Result.msg("Hystrix Error: Add");
//    }
//
//    private Result<Integer> deleteFallback(String id) {
//        return Result.msg("Hystrix Error: Delete");
//    }

}
