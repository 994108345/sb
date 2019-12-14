package cn.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author wzl
 * @date Created in 2019/12/13 13:15
 */
@FeignClient("hystrix")
public interface HystrixClient {

    @RequestMapping(value = "hystrix/get-hello",method = RequestMethod.GET)
    String getHello();

}
