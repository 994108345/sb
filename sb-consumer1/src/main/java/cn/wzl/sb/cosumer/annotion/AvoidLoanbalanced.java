package cn.wzl.sb.cosumer.annotion;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;

/**
 * Created by 99410 on 2018/10/19.
 */
public class AvoidLoanbalanced {
    @Bean
    public IRule ribbonRule() {
        return new RoundRobinRule();        //轮询
        // return new WeightedResponseTimeRule();  //加权权重
        //return new RetryRule();          //带有重试机制的轮训
        //return new RandomRule();          //随机
        //return new MyBalanceRule();           //自定义规则
    }
}
