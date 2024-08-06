//package com.salescode.cache.service;
//
//public class EhCache implements Cache {
//
//    private final org.ehcache.CacheManager cacheManager;
//
//    private static EhCache instance;
//
//    private EhCache(org.ehcache.CacheManager cacheManager) {
//        this.cacheManager = cacheManager;
//    }
//
//    public static synchronized EhCache getInstance(org.ehcache.CacheManager cacheManager) {
//        if (instance == null) {
//            instance = new EhCache(cacheManager);
//        }
//        return instance;
//    }
//
//    @Override
//    public <T> void put(String cacheName, String key, T value) {
//        Cache cache = cacheManager.getCache(cacheName);
//        if (cache != null) {
//            cache.put(key, value);
//        }
//    }
//
//    @Override
//    public <T> T get(String cacheName, String key) {
//        Cache cache = cacheManager.getCache(cacheName);
//        return cache != null ? (T) cache.get(key, Object.class) : null;
//    }
//
//    @Override
//    public <T> void delete(String cacheName, String key) {
//        Cache cache = cacheManager.getCache(cacheName);
//        if (cache != null) {
//            cache.evict(key);
//        }
//    }
//
//    @Override
//    public void clearCache(String cacheName) {
//        Cache cache = cacheManager.getCache(cacheName);
//        if (cache != null) {
//            cache.clear();
//        }
//    }
