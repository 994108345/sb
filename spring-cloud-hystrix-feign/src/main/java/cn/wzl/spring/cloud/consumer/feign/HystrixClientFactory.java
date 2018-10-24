package cn.wzl.spring.cloud.consumer.feign;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFactory implements FallbackFactory<UserFeignClient> {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFactory.class);

    @Override
    public UserFeignClient create(Throwable cause) {
        HystrixClientFactory.LOGGER.info("the provider error is: {}", cause.getMessage());
        return new UserFeignClient() {
            @Override
            public String getUser() {
                return "wangwu";
            }
        };
    }
}
