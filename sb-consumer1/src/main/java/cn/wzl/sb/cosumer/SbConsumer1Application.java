package cn.wzl.sb.cosumer;

import cn.wzl.sb.cosumer.annotion.AvoidLoanbalanced;
import cn.wzl.sb.cosumer.annotion.ExcludeFromComponentScan;
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
/*关联我们写的均衡负载类*/
@RibbonClient(name = "sb-provider", configuration = AvoidLoanbalanced.class)
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class) })
public class SbConsumer1Application {
    @Bean
    @LoadBalanced //开启均衡负载
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(SbConsumer1Application.class, args);
    }
}
