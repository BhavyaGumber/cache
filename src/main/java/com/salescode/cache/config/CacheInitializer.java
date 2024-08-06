//package com.salescode.cache.config;
//
//
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class CacheInitializer {
//    @Value("${cache.local.enabled}")
//    private boolean localCacheEnabled;
//
//    @Value("${cache.distributed.enabled}")
//    private boolean distributedCacheEnabled;
//
//    @Bean
//    public CacheManager cacheManager(EhcacheConfig ehcacheConfig, RedisConfig redisConfig) {
//        Cache localCache = localCacheEnabled ? EhCache.getInstance(ehcacheConfig.cacheManager()) : null;
//        Cache distributedCache = distributedCacheEnabled ? RedisService.getInstance(redisConfig.redissonClient()) : null;
//        return CacheManager.getInstance(localCache, distributedCache);
//    }
//}
//
//
