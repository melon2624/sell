package com.zx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangxin
 * @date 2021/8/1 4:49
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @RequestMapping("/auth")
    public  void  auth(@RequestParam("code") String code){
        log.info("进入auth方法。。。");

    String url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxb837b2e53601593b&secret=91d5df2644858da89c22a7ce1261ae4a&code="+code+"&grant_type=authorization_code";
        RestTemplate restTemplate=new RestTemplate();

    String response=restTemplate.getForObject(url,String.class);
    log.info("response={}",response);

    }

}
