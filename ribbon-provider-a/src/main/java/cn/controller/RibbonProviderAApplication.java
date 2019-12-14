package cn.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 99410 on 2018/10/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonProviderAApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(RibbonProviderAApplication.class, args);
            System.out.println("RibbonProvider-a-run-success");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("RestTemplateApplication-run-erroe");
        }
    }

    /**
     * 定义脚手架
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
