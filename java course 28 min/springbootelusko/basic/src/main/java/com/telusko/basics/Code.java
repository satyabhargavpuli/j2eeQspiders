package com.telusko.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Code {
      @Autowired
	private Laptop laptop;
	public void check() {
		System.out.println("check");
		laptop.compile();
	}
}
