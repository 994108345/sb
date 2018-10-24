package cn.wzl.sb.study.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 99410 on 2018/10/19.
 */
@RestController
@RequestMapping("Simple")
public class SimpleController {
    @GetMapping("getName")
    public String getName(){
        return "张三";
    }
}
