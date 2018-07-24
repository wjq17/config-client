package com.junq.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: config-client
 * @description: 创建一个RESTful接口来返回配置中心的from属性，通过@RefreshScope来实现刷新
 * @author: junQiuW
 * @create: 2018-07-24 13:04
 **/

@RefreshScope
@RestController
public class TestController {

//  @Value("${from}") //git配置文件里面的key
//  private String from;
//
//  @RequestMapping("/from")
//  public String from(){
//    return this.from;
//  }

  // 除了通过@Value注解绑定注入以外，也可以通过Environment对象来获取配置属性
  @Autowired
  private Environment env;

  @RequestMapping("/from")
  public String from(){
    return env.getProperty("from", "undefined");
  }

}
