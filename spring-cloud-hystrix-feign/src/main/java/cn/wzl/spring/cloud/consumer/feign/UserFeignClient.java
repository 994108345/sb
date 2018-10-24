package cn.wzl.spring.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "provider", fallbackFactory = HystrixClientFactory.class)
public interface UserFeignClient {

  @GetMapping(value = "/user/getUser/")
  String getUser();


}
