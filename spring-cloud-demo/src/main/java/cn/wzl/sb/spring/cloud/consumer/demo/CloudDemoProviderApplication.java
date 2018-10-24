package cn.wzl.sb.spring.cloud.consumer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 99410 on 2018/10/17.
 */

/**
 *  @EnableEurekaClient表示是客户端
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudDemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDemoProviderApplication.class,args);
    }
}
