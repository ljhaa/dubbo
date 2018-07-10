package com.yph.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yph.api.Mytest;

@Service(timeout = 5000)
public class MytestImpl implements Mytest{

	public String syso(String name) {
		
		System.out.println("my name is "+name);
		
		return "your name is "+name;
	}

}
