package com.mk.pattern.example1;

public class CallingClient {
	
	public void execute() {
		ITarget target = new AdaptorToTarget(new Adaptee());
		target.request();
	}

}
