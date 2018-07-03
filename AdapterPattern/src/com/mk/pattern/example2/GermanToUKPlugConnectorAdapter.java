package com.mk.pattern.example2;

public class GermanToUKPlugConnectorAdapter implements UKPlugConnector{
	
	private GermanPlugConnector plug;

    public GermanToUKPlugConnectorAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public String provideElectricity() {
        return plug.giveElectricity();
    }
}
