package com.example.scheduletask.task;

import com.example.scheduletask.service.LoginService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


//@Component
//public class Jobs {
//    public final static long ONE_Minute=60*1000;
//    SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//    @Scheduled(fixedDelay = ONE_Minute)
//    public void fixedDeLayJob(){
//        //需要等待任务执行完后隔一分钟执行
//        System.out.println(format.format(new Date())+">>fixedDelay执行。。。。");
//    }
//    @Scheduled(fixedDelay = ONE_Minute)
//    public void fixedRateJob(){
//        //不管该任务是否执行都每间隔一分钟执行一次
//        System.out.println(format.format(new Date())+">>fixedRate执行。。。。");
//    }
    /*
    * 第一位：秒0-59
    * 第二位：分0-59
    * 第三位：小时0-23
    * 第四位：天1-31
    * 第五位：月份1-12
    * 第六位：星期1-7（1表示星期天2表示星期一）
    * 第七位：年份
    * 星号（*）表示每
    * 问号（？）表示不确定，只能出现在天或星期的位置
    * */
//    @Scheduled(cron = "0 06 19 * * ?")
//    public void cornJob(){
//        System.out.println(format.format(new Date())+">>cron执行。。。。");
//    }
//}
///**
// * Created by lq on 2018/10/10.
// * 自定义的Job任务类
// */
//@Component
//public class Jobs {
//
//    @Resource
//    private LoginService loginService;
//
//    @Scheduled(cron = "0 17 08 * * ? ")
//    public void updateTodayWalks() throws Exception {
//        loginService.getUsers();
//    }
//
//}
