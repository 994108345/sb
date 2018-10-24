package cn.wzl.sb.spring.cloud.consumer.demo.controller;

import cn.wzl.sb.spring.cloud.consumer.demo.domain.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 99410 on 2018/10/17.
 */

/**
 * @RestController注解呢，其实就是@ResponseBody ＋ @Controller的组合注解
 */
@RestController
@RequestMapping("/User")
public class UserController {

    /**
     * @GetMapping呢，相当于@RequestMapping(value="", method = RequestMethod.GET)
     * */
    @GetMapping(value="/getUser/{username}")
    public UserInfo getUser(@PathVariable String username){
        UserInfo userInfo = new UserInfo();
        userInfo.setName(username);
        return userInfo;
    }

    @GetMapping(value = "/getName")
    public String getName(){
        return "张三";
    }

}
