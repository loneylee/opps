package com.opps.provider.controller;

import com.opps.provider.dao.UserMapper;
import com.opps.provider.entity.User;
import com.opps.provider.request.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lishuai on 2017/12/11.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public Result<Integer> deleteByPrimaryKey(@PathVariable String id) {
        return Result.success(this.userMapper.deleteByPrimaryKey(id));
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Result<Integer> insert(@RequestBody User record) {
        return Result.success(this.userMapper.insert(record));
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Result<User> selectByPrimaryKey(@PathVariable String id) {
        return Result.success(this.userMapper.selectByPrimaryKey(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result<Integer> updateByPrimaryKey(@RequestBody User record) {
        return Result.success(this.userMapper.updateByPrimaryKey(record));
    }
}
