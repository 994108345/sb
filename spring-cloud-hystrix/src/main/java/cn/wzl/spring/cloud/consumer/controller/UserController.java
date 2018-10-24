package cn.wzl.spring.cloud.consumer.controller;

import cn.wzl.spring.cloud.consumer.domain.UserInfo;
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
    private RestTemplate restTemplate;

    @GetMapping(value="/getUser/{userName}")
    public UserInfo getUser(@PathVariable String userName){
        return restTemplate.getForObject("http://localhost:8078/User/getUser/"+userName,UserInfo.class);
    }

    @GetMapping("consumer")
    @HystrixCommand(fallbackMethod = "getUserFallback")
    public Object getUserName(){
        return restTemplate.getForObject("http://provider/User/getName",String.class);
    }

    public Object getUserFallback(){
        return "哇咔咔，服务器奔溃啦";
    }
}
