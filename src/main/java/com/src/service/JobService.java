package com.src.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    //cron = "0/3 40 11 * * ?" 每天11:40触发，没三秒执行一次
    @Scheduled(cron = "0 46 23 * * ?")
    public void printTime() {
        System.out.println("current time :"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
