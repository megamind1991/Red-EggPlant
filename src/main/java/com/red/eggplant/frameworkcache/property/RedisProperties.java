package com.red.eggplant.frameworkcache.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties(prefix = "redis.native")
//@Component(value = "redisProperties")
//@Getter
//@Setter
public class RedisProperties {
    private String host;
    private Integer port;
    private String password;
    private Integer maxTotal;
    private Integer maxIdle;
    private Integer minIdle;

}