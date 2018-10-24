package cn.wzl.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 99410 on 2018/10/17.
 */
@SpringBootApplication
/*s该注解，意思为，该类为eureka服务器*/
@EnableEurekaServer
public class SbEure1Application {
    public static void main(String[] args) {
        SpringApplication.run(SbEure1Application.class, args);
    }
}
