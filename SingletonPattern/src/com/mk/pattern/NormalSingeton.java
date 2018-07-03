package com.mk.pattern;

public class NormalSingeton {
	
	private static NormalSingeton instance;
	
	private NormalSingeton() {}
	
	public static NormalSingeton getInstance() {
		
		if(null == instance) {
			instance = new NormalSingeton();
		}
		
		return instance;
	}

}
