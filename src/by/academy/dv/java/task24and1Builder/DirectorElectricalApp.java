package by.academy.dv.java.task24and1Builder;

public class DirectorElectricalApp {

	ElecAppBuilder builder;

	public void setBuilder(ElecAppBuilder b) {
		builder = b;
	}

	MyElectricalApp buildElApp() {
		builder.createElecAppliance();
		builder.buildCoast();
		builder.buildColor();
		builder.buildEnergySaving();
		builder.buildHeight();
		builder.buildModel();
		builder.buildPower();
		builder.buildProdcompany();
		builder.buildSerialNum();
		builder.buildWeight();
		builder.buildWidth();

		MyElectricalApp appliance = builder.getAppliance();
		return appliance;
	}

}
