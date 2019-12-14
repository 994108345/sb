package cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wzl
 * @date Created in 2019/12/12 16:04
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    /**
     * 普通测试该项目是否可以调用
     * @return
     */
    @RequestMapping("get-test")
    public String getTest(){
        return "hello";
    }

    /**
     * 调用自己本身
     * 注意 ribbon-consumer 就是服务的名称，就是配置文件里面配置的spring.application.name
     * @return
     */
    @RequestMapping("get-ourself")
    public String getOurSelf(){
        String result = restTemplate.getForObject("http://ribbon-consumer/consumer/get-test", String.class);
        return result;
    }

    /**
     * 调用负载均衡
     * 注意 ribbon-provider 就是服务的名称，就是配置文件里面配置的spring.application.name
     * @return
     */
    @RequestMapping("get-hello")
    public String getHello(){
        String result = restTemplate.getForObject("http://ribbon-provider/provider/get-hello", String.class);
        return result;
    }

}
