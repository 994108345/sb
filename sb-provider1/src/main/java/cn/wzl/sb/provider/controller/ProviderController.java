package cn.wzl.sb.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 99410 on 2018/10/19.
 */
@RestController
@RequestMapping("Provider")
public class ProviderController {
    @GetMapping("getName")
    public String egtName(){
        return "李四";
    }
}
