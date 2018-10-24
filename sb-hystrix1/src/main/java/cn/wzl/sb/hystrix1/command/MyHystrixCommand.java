package cn.wzl.sb.hystrix1.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixRequestCache;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategyDefault;
import com.sun.javafx.image.impl.ByteIndexed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 99410 on 2018/10/22.
 */
public class MyHystrixCommand extends HystrixCommand{
    @Autowired
    private RestTemplate restTemplate;

    String id;

    public MyHystrixCommand(Setter setter, RestTemplate restTemplate) {
        super(setter);
        this.restTemplate = restTemplate;
    }

    @Override
    protected Object run() throws Exception {
        return restTemplate.getForObject("http://sb-provider/Provider/getName",String.class);
    }

    @Override
    protected Object getFallback() {
        return "服务器挂了";
    }

    @Override
    protected String getCacheKey() {
        return String.valueOf(id);
    }

    //清空缓存
    public static void flushCeche(String id ){
    }

}
