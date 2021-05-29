/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 *
 * @author suneelkumar.a
 */
public class redisTest {

    public static void main(String[] args) {
        JedisPoolConfig poolConfig = new JedisPoolConfig();

        JedisPool jedisPool = new JedisPool("localhost");
        Jedis jedis = jedisPool.getResource();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        jedis.set("test", "suneel");

    }
}
