package cn.wzl.spring.cloud.consumer.annotion;

import cn.wzl.spring.cloud.consumer.domain.TestRule;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 99410 on 2018/10/18.
 */
@Configuration
@ExcludeFromComponentScan
public class AvoidLoanbalanced {
    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();//轮询
        //return new WeightedResponseTimeRule();//加权权重
        // return new RetryRule();//带有重试机制的轮训
        // return new RandomRule();//随机
        // return new TestRule();//自定义规则
    }
}
