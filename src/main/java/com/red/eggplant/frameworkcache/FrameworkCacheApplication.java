package com.red.eggplant.frameworkcache;

import com.red.eggplant.frameworkcache.property.RedisProperties;
import com.red.eggplant.frameworkcache.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrameworkCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkCacheApplication.class, args);
        System.out.println(RedisUtil.get("name"));
    }

}
