package com.mk.pattern.example1;

/**
 * @author vf-root
 * 
 * https://www.youtube.com/watch?v=2PKQtcJjYvc&index=8&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc
 * 
 *
 */
public class AdaptorExample1Main {
	
//	The adapter pattern converts the interface of a class into another interface the 
//	clients expects. This pattern mainly adapts one object to another one. Adapter 
//	lets classes work together that couldn’t otherwise because of incompatible interfaces.

	public static void main(String[] args) {
		CallingClient callingClient = new CallingClient();
		callingClient.execute();
	}
}
