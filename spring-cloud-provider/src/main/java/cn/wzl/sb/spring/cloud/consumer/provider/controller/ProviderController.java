package cn.wzl.sb.spring.cloud.consumer.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 99410 on 2018/10/18.
 */
@RestController
@RequestMapping("/User")
public class ProviderController {
    @GetMapping(value = "/getName")
    public String getName(){
        return "李四";
    }
}
