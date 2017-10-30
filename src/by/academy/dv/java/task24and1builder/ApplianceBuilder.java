package by.academy.dv.java.task24and1builder;

public class ApplianceBuilder {

	public int height = 0;
	public int width = 0;
	public int weight = 0;
	public int coast = 0;
	public String model = "def";
	public String serialNum = "def";
	public String color = "def";
	public String prodCompany = "def";

	ApplianceBuilder buildHeight(int height) {
		this.height = height;
		return this;
	}

	ApplianceBuilder buildWidth(int width) {
		this.width = width;
		return this;
	};

	ApplianceBuilder buildWeight(int weight) {
		this.weight = weight;
		return this;
	};

	ApplianceBuilder buildCoast(int coast) {
		this.coast = coast;
		return this;
	};

	ApplianceBuilder buildModel(String model) {
		this.model = model;
		return this;
	};

	ApplianceBuilder buildSerialNum(String serialNum) {
		this.serialNum = serialNum;
		return this;
	};

	ApplianceBuilder buildColor(String color) {
		this.color = color;
		return this;
	};

	ApplianceBuilder buildProdcompany(String prodCompany) {
		this.prodCompany = prodCompany;
		return this;
	};

	MyAppliance build() {
		MyAppliance appliance = new MyAppliance();
		appliance.setCoast(coast);
		appliance.setColor(color);
		appliance.setHeight(height);
		appliance.setModel(model);
		appliance.setProdCom(prodCompany);
		appliance.setSerialNum(serialNum);
		appliance.setWeight(weight);
		appliance.setWidth(width);
		return appliance;
	};

}
