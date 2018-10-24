package cn.wzl.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 99410 on 2018/10/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudDemoEureHighApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDemoEureHighApplication.class, args);
    }
}
