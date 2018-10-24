package cn.wzl.sb.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 99410 on 2018/10/22.
 */
@FeignClient("sb-provider")
public interface HelloService {
    @RequestMapping("Provider/getName")
    String hello();
}
