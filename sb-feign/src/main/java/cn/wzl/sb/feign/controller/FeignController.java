package cn.wzl.sb.feign.controller;

import cn.wzl.sb.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 99410 on 2018/10/22.
 */
@RestController
public class FeignController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "sayHello",method = RequestMethod.GET)

    public String helloConsumer(){
        return helloService.hello();
    }
}
