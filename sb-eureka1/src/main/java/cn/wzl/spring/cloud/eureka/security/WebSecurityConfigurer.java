package cn.wzl.spring.cloud.eureka.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by 99410 on 2018/10/17.
 */
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter{
    /**
     * 如果您开启了权限验证并且SpringBoot版本为2.0以上的话还需要一个操作，如果不是此版本可以忽略这个类
     * 因为2.0默认开启了csrf，如果我们现在直接启动Eureka服务的话客户端是注册不上的，所以需要把csrf关闭
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
