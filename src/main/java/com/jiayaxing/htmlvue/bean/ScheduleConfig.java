package com.jiayaxing.htmlvue.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

//spring scheduled默认所有定时任务都在一个线程中，增加这个配置不同的任务会在不同的线程中互不影响
//增加这个配置后定时任务的处理不用加@EnableAsync
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(50));//给定时任务开启50个线程
    }
}
