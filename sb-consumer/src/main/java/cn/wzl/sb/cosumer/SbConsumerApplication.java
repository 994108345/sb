package cn.wzl.sb.cosumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 99410 on 2018/10/17.
 */
@SpringBootApplication
/*关联我们写的均衡负载类*/
@RibbonClient(name = "sb-provider", configuration = cn.wzl.sb.cosumer.config.LoadBalanced.class)
public class SbConsumerApplication {
    @Bean
    @LoadBalanced //开启均衡负载
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(SbConsumerApplication.class, args);
    }
}
