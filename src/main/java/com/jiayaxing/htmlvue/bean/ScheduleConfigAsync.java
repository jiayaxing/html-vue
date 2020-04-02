package com.jiayaxing.htmlvue.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

//开启这个配置后需要给定时任务处增加注解@Async才能让相同的定时任务异步执行，同一个定时任务也不会因为上一此阻塞而影响下一次之行
//@Configuration
//@EnableAsync
public class ScheduleConfigAsync {
    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(50);//给定时任务开启50个线程
        return taskScheduler;
    }
}
