package cn.controller;

import cn.service.command.DamoCommand;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 没有调通，会报错，找不到原因
 * @author wzl
 * @date Created in 2019/12/13 11:17
 */
@RestController
@RequestMapping("hystrix-command")
public class HystrixCommandController {

    @Resource
    private RestTemplate restTemplate;

    /**
     * hystrix的底层原理
     * @return
     */
    @GetMapping("getName")
    public String getName(){
        return (String) new DamoCommand(
                HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("GroupName")).
                        andCommandKey(HystrixCommandKey.Factory.asKey("CommandName")),restTemplate).
                execute();
    }

}
