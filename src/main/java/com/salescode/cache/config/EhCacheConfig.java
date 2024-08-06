//package com.salescode.cache.config;
//
//@Configuration
//public class EhcacheConfig {
//
//    @Bean
//    public CacheManager cacheManager() {
//        // Define and return Ehcache CacheManager
//        return CacheManagerBuilder.newCacheManagerBuilder()
//                .withCache("defaultCache",
//                        CacheConfigurationBuilder.newCacheConfigurationBuilder(
//                                        String.class, Object.class,
//                                        ResourcePoolsBuilder.heap(1000))
//                                .build())
//                .build(true);
//    }
//}
//
