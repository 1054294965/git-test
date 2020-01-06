package com.example.accessingdatamysql.web;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;
//

@Service
public class CacheServiceImpl {
    @Cacheable(value="cache1")// cache1
    public int get() {

        int num = new Random().nextInt();
<<<<<<< HEAD
        //local1
=======
        //modify1
>>>>>>> remotes/origin/master
        return num;
    }
    @Cacheable(value="cache2")// cache2
    public int get2() {
<<<<<<< HEAD
//local2
=======
//modify2
>>>>>>> remotes/origin/master
        int num = new Random().nextInt();
        return num;
    }
    @CachePut(value={"cache1"})// 更新
    public int put() {
        return new Random().nextInt();
    }
    @CacheEvict(value={"cache1,cache2"})// 清空
    public void evict() {
    }
}
