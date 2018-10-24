package cn.wzl.spring.cloud.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeignClient {
    @Override
    public String getUser() {
        return "钱五";
    }
}
