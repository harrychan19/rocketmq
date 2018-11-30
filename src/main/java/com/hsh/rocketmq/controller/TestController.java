package com.hsh.rocketmq.controller;

import com.hsh.rocketmq.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hushihai
 * @version V1.0, 2018/11/30
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    ProducerService producerService;

    @RequestMapping("/push")
    public String pushMsg(String msg) {
        return producerService.send("TopicTest", "push", msg);
    }
}
