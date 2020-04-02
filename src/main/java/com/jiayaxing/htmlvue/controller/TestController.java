package com.jiayaxing.htmlvue.controller;


import com.jiayaxing.htmlvue.bean.WebSocketServer;
import com.jiayaxing.htmlvue.entity.UserEntity;
import com.jiayaxing.htmlvue.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "testController")
public class TestController {
    private static Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @GetMapping(value = "get1")
    public UserEntity get1(Integer id){
        log.info("111");
        UserEntity byId = testService.findById(id);
        return byId;
    }

    @GetMapping(value = "get2")
    public String get2() throws IOException {
        WebSocketServer.sendAllInfo("统一推送消息");
        return "发送消息成功";
    }

}
