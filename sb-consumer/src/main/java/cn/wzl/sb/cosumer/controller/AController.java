package cn.wzl.sb.cosumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 99410 on 2018/10/19.
 */
@RestController
@RequestMapping("ConsumerA")
public class AController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getName")
    public Object getName(){
        /*参数为服务地址，和返回参数的类型*/
        return restTemplate.getForObject("http://sb-provider/Provider/getName",String.class);
    }
}
