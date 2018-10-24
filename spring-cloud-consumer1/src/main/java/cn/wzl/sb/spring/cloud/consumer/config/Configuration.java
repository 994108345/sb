package cn.wzl.sb.spring.cloud.consumer.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

/**
 * Created by 99410 on 2018/10/18.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }
}
