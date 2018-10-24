package cn.wzl.sb.hystrix.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 99410 on 2018/10/22.
 */
@RestController
@RequestMapping("Hystrix")
public class HystrixContreoller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getName")
    //该注解指定断路器返回的错误响应方法为errorBack()
    @HystrixCommand(fallbackMethod = "errorBack")
    public Object hystixController(){
        return restTemplate.getForObject("http://sb-provider/Provider/getName",String.class);
    }
    /*错误响应方法*/
    String errorBack(){
        return "服务器挂啦";
    }


}
