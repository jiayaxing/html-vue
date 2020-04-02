package com.jiayaxing.htmlvue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 支持定时任务
public class HtmlVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtmlVueApplication.class, args);
	}

}
