package com.opps.consumer.service;

import com.opps.consumer.entity.User;
import com.opps.consumer.request.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lishuai on 2017/12/11.
 */
@FeignClient("provider01")
public interface ConsumerFeignSerivce {


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    Result<Integer> deleteByPrimaryKey(@PathVariable("id") String id);

    @RequestMapping(method = RequestMethod.PUT)
    Result<Integer> insert(@RequestBody User record);

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Result<User> selectByPrimaryKey(@PathVariable("id") String id);

    @RequestMapping(method = RequestMethod.POST)
    Result<Integer> updateByPrimaryKey(@RequestBody User record);
}
