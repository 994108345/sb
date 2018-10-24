package cn.wzl.sb.spring.cloud.consumer.feign;

import cn.wzl.sb.spring.cloud.consumer.config.Configuration;
import cn.wzl.sb.spring.cloud.consumer.domain.UserInfo;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by 99410 on 2018/10/18.
 */
/*使用Feign默认配置*/
@FeignClient(value = "provider",configuration = Configuration.class)
/*使用SpringMvc配置*/
//@FeignClient(value = "provider")
public interface  UserFeignClient {
    /**
     * 默认使用SpringMvc的版本，但是配置文件配置了Contract.Default()，就使用的是Feign自己的版本
     * @return
     */
    /*springMbc版本*/
    /*@GetMapping(value = "/user/getUser/{userName}")
    public UserInfo getUser(@PathVariable("userName")String userName);

    @GetMapping(value = "/User/getName")
    public String getName();*/

    /*Feign版本*/
    @RequestLine("GET /User/getName")
    public String getName();
}
