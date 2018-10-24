package cn.wzl.sb.hystrix1.controller;

import cn.wzl.sb.hystrix1.command.MyHystrixCommand;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 99410 on 2018/10/22.
 */
@RestController
@RequestMapping("Hystrix1")
public class Hystrix1Controoler {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("getName")
    public String getName(){
        return (String) new MyHystrixCommand(
                HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("GroupName")).
                        andCommandKey(HystrixCommandKey.Factory.asKey("CommandName")),restTemplate).
                execute();
    }

}
