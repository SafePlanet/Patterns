package com.mk.pattern.example1;

public class AdaptorToTarget implements ITarget {
	
	Adaptee adaptee;
	
	public AdaptorToTarget(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		this.adaptee.specificRequest();
	}

}
