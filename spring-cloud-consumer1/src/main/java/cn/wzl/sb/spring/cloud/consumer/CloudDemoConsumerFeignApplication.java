package cn.wzl.sb.spring.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by 99410 on 2018/10/17.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CloudDemoConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDemoConsumerFeignApplication.class, args);
    }
}
