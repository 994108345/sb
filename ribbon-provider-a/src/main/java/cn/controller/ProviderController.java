package cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzl
 * @date Created in 2019/12/12 16:04
 */
@RestController
@RequestMapping(value = "/provider")
public class ProviderController {

    @RequestMapping("get-hello")
    public String getHello(){
        return "hello-provider-a---";
    }

}
