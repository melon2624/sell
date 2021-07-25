package com.zx;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoggerTest {

    private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1() {
        String name="zhangxin";
        String password="123456";
        logger.debug("debug");
        logger.info("name:{},password:{}",name,password);
        logger.info("info");
        logger.error("error");
    }
}
