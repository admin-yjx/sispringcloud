package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //包含@EnableZuulServer,设置该类是网关的启动类
@EnableAutoConfiguration //可以帮助Spring boot应用将所有符合条件的@Configuration配置加载到当前SpringBoot创建使用的IOC容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
