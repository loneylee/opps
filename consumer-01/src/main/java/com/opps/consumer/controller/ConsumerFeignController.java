package com.opps.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.opps.consumer.entity.User;
import com.opps.consumer.request.Result;
import com.opps.consumer.service.ConsumerFeignSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jason on 5/10/16.
 */
@RequestMapping("user-feign")
@RestController
public class ConsumerFeignController {
    @Autowired
    private ConsumerFeignSerivce consumerFeignSerivce;


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @HystrixCommand(fallbackMethod = "deleteFallback")
    public Result<Integer> deleteByPrimaryKey(@PathVariable String id) {
        return this.consumerFeignSerivce.deleteByPrimaryKey(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @HystrixCommand(fallbackMethod = "insertFallback")
    public Result<Integer> insert(@RequestBody User record) {
        return this.consumerFeignSerivce.insert(record);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "selectByPrimaryKeyFallback")
    public Result<User> selectByPrimaryKey(@PathVariable String id) {
        return this.consumerFeignSerivce.selectByPrimaryKey(id);
    }


    @RequestMapping(method = RequestMethod.POST)
    @HystrixCommand(fallbackMethod = "updateByPrimaryKeyFallback")
    public Result<Integer> updateByPrimaryKey(@RequestBody User record) {
        return this.consumerFeignSerivce.updateByPrimaryKey(record);
    }

    private Result<Integer> updateByPrimaryKeyFallback(User record) {
        return Result.msg("Hystrix Error: Update");
    }

    private Result<User> selectByPrimaryKeyFallback(String id) {
        return Result.msg("Hystrix Error: Query");
    }

    private Result<Integer> insertFallback(User record) {
        return Result.msg("Hystrix Error: Add");
    }

    private Result<Integer> deleteFallback(String id) {
        return Result.msg("Hystrix Error: Delete");
    }

}
