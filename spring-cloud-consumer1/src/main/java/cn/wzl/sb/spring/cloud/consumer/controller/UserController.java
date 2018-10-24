package cn.wzl.sb.spring.cloud.consumer.controller;

import cn.wzl.sb.spring.cloud.consumer.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 99410 on 2018/10/17.
 */
@RestController
@RequestMapping("/Consumer")
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping(value="/getUser")
    public String getUser(){
        return userFeignClient.getName();
    }
}
