package cn.wzl.sb.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 99410 on 2018/10/17.
 */

/**
 *  @EnableEurekaClient表示是客户端
 */
@EnableZuulProxy
@SpringBootApplication
public class CloudDemoZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDemoZuulApplication.class,args);
    }
}
