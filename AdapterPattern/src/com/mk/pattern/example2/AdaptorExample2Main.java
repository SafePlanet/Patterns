package com.mk.pattern.example2;


/**
 * @author vf-root
 * 
 * http://www.vogella.com/tutorials/DesignPatternAdapter/article.html
 *
 */
public class AdaptorExample2Main {
	
	public static void main(String[] args) {
		GermanPlugConnector plugConnector = new GermanPlugConnector();
		UKElectricalSocket electricalSocket = new UKElectricalSocket();
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plugConnector);
		System.out.println(electricalSocket.plugIn(ukAdapter));
	}

}
