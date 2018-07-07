package com.mk.pattern;

public class DoubleCheckedLockingSingleton {
	
	private volatile static DoubleCheckedLockingSingleton instance;
	 
    private DoubleCheckedLockingSingleton() {}
 
    public static DoubleCheckedLockingSingleton getInstance()
    {
        if (instance == null)
        {
            // To make thread safe
            synchronized (DoubleCheckedLockingSingleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (instance==null)
                    instance = new DoubleCheckedLockingSingleton();
            }
        }
        return instance;
    }

}
