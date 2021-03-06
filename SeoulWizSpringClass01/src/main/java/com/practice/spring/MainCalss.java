package com.practice.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCalss {

	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyInfo myinfo = ctx.getBean("myInfo", MyInfo.class);
		myinfo.getInfo();
		ctx.close();
	}

}
