package cn.wzl.sb.study.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 99410 on 2018/10/17.
 */

/**
 *  @EnableEurekaClient表示是客户端
 */
@SpringBootApplication
public class SimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class,args);
    }
}
