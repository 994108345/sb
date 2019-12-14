package cn.feign.controller;

import cn.feign.client.HystrixClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wzl
 * @date Created in 2019/12/13 13:14
 */
@RestController
@RequestMapping("feign")
public class FeignController {

    @Resource
    private HystrixClient hystrixClient;

    @RequestMapping("get-hello")
    public String getFeign(){
        return hystrixClient.getHello();
    }

}
