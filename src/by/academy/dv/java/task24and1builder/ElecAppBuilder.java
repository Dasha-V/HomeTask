package by.academy.dv.java.task24and1builder;

abstract class ElecAppBuilder {
	MyElectricalApp appliance;

	public void createElecAppliance() {
		appliance = new MyElectricalApp();
	}

	abstract void buildHeight();

	abstract void buildWidth();

	abstract void buildWeight();

	abstract void buildCoast();

	abstract void buildModel();

	abstract void buildSerialNum();

	abstract void buildColor();

	abstract void buildProdcompany();

	abstract void buildPower();

	abstract void buildEnergySaving();

	boolean getPlugged() {
		return appliance.plugged();

	}

	MyElectricalApp getAppliance() {
		return appliance;
	}

}
