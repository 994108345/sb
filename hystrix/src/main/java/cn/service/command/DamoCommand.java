package cn.service.command;

import com.netflix.hystrix.HystrixCommand;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @author wzl
 * @date Created in 2019/12/13 11:18
 */
public class DamoCommand extends HystrixCommand {

    @Autowired
    private RestTemplate restTemplate;

    String id;

    public DamoCommand(Setter setter, RestTemplate restTemplate) {
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
