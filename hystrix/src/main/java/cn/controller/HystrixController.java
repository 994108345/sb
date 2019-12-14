package cn.controller;

import cn.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wzl
 * @date Created in 2019/12/12 18:13
 */
@RestController
@RequestMapping("hystrix")
public class HystrixController {

    @GetMapping("getName")
    //该注解指定断路器返回的错误响应方法为errorBack()
    @HystrixCommand(fallbackMethod = "errorBack")
    public Object hystixController(){
        int a = 1/0;
        return "";
    }
    /*错误响应方法*/
    String errorBack(){
        return "服务器挂啦";
    }

    @RequestMapping("get-hello")
    public String getHello(){
        return "hello world";
    }
}
