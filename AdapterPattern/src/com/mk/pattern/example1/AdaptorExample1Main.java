package com.mk.pattern.example1;

/**
 * @author vf-root
 * 
 * https://www.youtube.com/watch?v=2PKQtcJjYvc&index=8&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc
 * 
 * 	When to use Adapter Pattern
When you have a third-party code that cannot interact with the client code. For example, you might want to use a third-party 
logger service, but your code is having incompatibility issues, you can use this pattern.
When you want to use an existing code with extended functionality but not without changing it, as it is being used in other components, 
you can extend it using the adapter pattern.
Again you can use an object adapter for a code, which is using sealed class components, or needs multiple inheritance. For a requirement 
where you need to use single inheritance, you can choose a class adapter.
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
