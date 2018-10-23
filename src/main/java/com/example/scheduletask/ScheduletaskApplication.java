package com.example.scheduletask;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling//运行定时任务需要在主类加入该注解
@EnableSwagger2Doc
public class ScheduletaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduletaskApplication.class, args);
	}
}
