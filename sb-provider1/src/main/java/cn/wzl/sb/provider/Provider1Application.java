package cn.wzl.sb.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 99410 on 2018/10/17.
 */

/**
 *  @EnableEurekaClient表示是客户端
 */
/*@EnableEurekaClient 修饰服务提供者 */
@EnableEurekaClient
@SpringBootApplication
public class Provider1Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider1Application.class,args);
    }
}
