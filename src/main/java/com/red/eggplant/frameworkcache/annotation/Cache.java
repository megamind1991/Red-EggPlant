package com.red.eggplant.frameworkcache.annotation;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cache {
    String cacheNames() default ""; //和value注解差不多，二选一
    String keyGenerator() default ""; //key的生成器。key/keyGenerator二选一使用
    String cacheManager() default ""; //指定缓存管理器
    String cacheResolver() default ""; //或者指定获取解析器
    String condition() default ""; //条件符合则缓存
    String unless() default ""; //条件符合则不缓存
    boolean sync() default false; //是否使用异步模式
}
