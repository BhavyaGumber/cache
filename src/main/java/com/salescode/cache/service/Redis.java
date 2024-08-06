//package com.salescode.cache.service;
//
//public class RedisService implements Cache {
//
//    private final RedissonClient redissonClient;
//
//    private static RedisService instance;
//
//    private RedisService(RedissonClient redissonClient) {
//        this.redissonClient = redissonClient;
//    }
//
//    public static synchronized RedisService getInstance(RedissonClient redissonClient) {
//        if (instance == null) {
//            instance = new RedisService(redissonClient);
//        }
//        return instance;
//    }
//
//    @Override
//    public <T> void put(String cacheName, String key, T value) {
//        RMap<String, T> map = redissonClient.getMap(cacheName);
//        map.put(key, value);
//    }
//
//    @Override
//    public <T> T get(String cacheName, String key) {
//        RMap<String, T> map = redissonClient.getMap(cacheName);
//        return map.get(key);
//    }
//
//    @Override
//    public <T> void delete(String cacheName, String key) {
//        RMap<String, T> map = redissonClient.getMap(cacheName);
//        map.remove(key);
//    }
//
//    @Override
//    public void clearCache(String cacheName) {
//        RMap<String, ?> map = redissonClient.getMap(cacheName);
//        map.delete();
//    }
//}