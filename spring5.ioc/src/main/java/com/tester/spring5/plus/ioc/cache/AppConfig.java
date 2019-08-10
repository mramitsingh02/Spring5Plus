package com.tester.spring5.plus.ioc.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.tester.spring5.plus.ioc.cache")
@EnableCaching
public class AppConfig {

    @Bean
    public CacheManager cacheManager(){
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        String str="myStudent";
        Cache cache = new ConcurrentMapCache(str);
        cacheManager.setCaches(Arrays.asList(cache));
        return cacheManager;
    }

}
