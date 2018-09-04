package com.startsi.hnhousehold.start;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.startsi.hnhousehold.service.HzService;


@Component
public class Ceshi {
    @Autowired
    private HzService hzService;
	public void start() throws Exception{
		System.out.println(hzService);
		System.out.println(new Date()+"进入定时任务");
		hzService.starthzService();
	}
}
