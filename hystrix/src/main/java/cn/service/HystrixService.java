package cn.service;

import cn.service.fallback.HystrixServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wzl
 * @date Created in 2019/12/12 18:21
 */
@FeignClient(value = "hystrix", fallback = HystrixServiceFallback.class)
public interface HystrixService {

    @RequestMapping("/sayHello")
    String sayHello();

}
