package cn.wzl.spring.cloud.consumer.controller;

import cn.wzl.spring.cloud.consumer.domain.UserInfo;
import cn.wzl.spring.cloud.consumer.feign.UserFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 99410 on 2018/10/17.
 */
@RestController
@RequestMapping("/Consumer")
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("consumer")
    public Object getUserName(){
        return userFeignClient.getUser();
    }
}
