package cn.service.fallback;

import cn.service.HystrixService;
import org.springframework.stereotype.Component;

/**
 * 熔断的回退界面
 * @author wzl
 * @date Created in 2019/12/12 19:59
 */
@Component
public class HystrixServiceFallback implements HystrixService {

    @Override
    public String sayHello() {
        return "系统繁忙，请稍候再试";
    }
}
