//package com.salescode.cache.manager;
//
//@Component
//public class CacheManager {
//
//    private final Cache localCache;
//    private final Cache distributedCache;
//
//    @Autowired
//    public CacheManager(Cache localCache, Cache distributedCache) {
//        this.localCache = localCache;
//        this.distributedCache = distributedCache;
//    }
//
//    public static synchronized CacheManager getInstance(Cache localCache, Cache distributedCache) {
//        if (instance == null) {
//            instance = new CacheManager(localCache, distributedCache);
//        }
//        return instance;
//    }
//
//    // Unified put method
//    public <T> void put(String cacheName, String key, T value) {
//        if (localCache != null) {
//            localCache.put(cacheName, key, value);
//        }
//        if (distributedCache != null) {
//            distributedCache.put(cacheName, key, value);
//        }
//    }
//
//    OR
//
//            (If we want to Flexibly Choose Between Local and Distributed Cache for Each Operation)
//
//    public <T> void put(String cacheName, String key, T value, boolean useLocalCache) {
//        if (useLocalCache && localCache != null) {
//            localCache.put(cacheName, key, value);
//        }
//        if (distributedCache != null) {
//            distributedCache.put(cacheName, key, value);
//        }
//    }
//
//    // Unified get method
//    public <T> T get(String cacheName, String key) {
//        if (localCache != null) {
//            T value = localCache.get(cacheName, key);
//            if (value != null) {
//                return value;
//            }
//        }
//        return distributedCache != null ? distributedCache.get(cacheName, key) : null;
//    }
//
//    // Unified delete method
//    public <T> void delete(String cacheName, String key) {
//        if (localCache != null) {
//            localCache.delete(cacheName, key);
//        }
//        if (distributedCache != null) {
//            distributedCache.delete(cacheName, key);
//        }
//    }
//
//    // Unified clear cache method
//    public void clearCache(String cacheName) {
//        if (localCache != null) {
//            localCache.clearCache(cacheName);
//        }
//        if (distributedCache != null) {
//            distributedCache.clearCache(cacheName);
//        }
//    }