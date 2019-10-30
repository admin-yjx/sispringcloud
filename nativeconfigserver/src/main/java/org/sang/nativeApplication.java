package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //声明配置中心
public class nativeApplication {
    public static void main(String[] args) {
        SpringApplication.run(nativeApplication.class,args);
    }
}
