package com.jiayaxing.htmlvue.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class ScheduledController {
    private static Logger log = LoggerFactory.getLogger(ScheduledController.class);


    @Scheduled(fixedDelay = 10, initialDelay=1000)//第一次执行延时1000毫秒,等上一次执行完成后10毫秒再执行
    public void uploadOcr(){
        try {
            log.info("运行中1");
            Thread.currentThread().sleep(60000);//间隔一分钟
        } catch (Exception e) {
            e.printStackTrace();
            log.error("异常1",e);
        }
    }

    @Scheduled(fixedDelay = 10, initialDelay=2000)//第一次执行延时2000毫秒,等上一次执行完成后10毫秒再执行
    public void uploadNotOcr(){
        try {
            log.info("运行中2");
            Thread.currentThread().sleep(60000);//间隔一分钟
        } catch (Exception e) {
            e.printStackTrace();
            log.error("异常2",e);
        }
    }


}
