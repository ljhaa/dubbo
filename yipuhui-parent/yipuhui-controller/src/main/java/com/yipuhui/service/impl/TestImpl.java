package com.yipuhui.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yipuhui.service.Test;
import com.yph.api.Mytest;


@Service
public class TestImpl implements Test {
	
	
	@Reference
	private Mytest mytest;

	public String testcon(String name) {
		
		return  mytest.syso(name);
		
	}

}
