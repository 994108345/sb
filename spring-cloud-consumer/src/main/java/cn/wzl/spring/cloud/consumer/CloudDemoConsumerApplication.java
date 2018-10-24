package cn.wzl.spring.cloud.consumer;

import cn.wzl.spring.cloud.consumer.annotion.ExcludeFromComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 99410 on 2018/10/17.
 */
@SpringBootApplication
@RibbonClient(name = "provider", configuration = cn.wzl.spring.cloud.consumer.config.LoadBalanced.class)
/*指定扫描的时候忽略上方的注解类*/
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class) })
public class CloudDemoConsumerApplication {
    /**
     * @Bean等同于以前的xml配置bean
     * @return
     */
    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(CloudDemoConsumerApplication.class, args);
    }
}
