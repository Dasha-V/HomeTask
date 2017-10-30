package by.academy.dv.java.task24and1builder;

public class MyAppliance {

	private int height;
	private int width;
	private int weight;
	private int coast;
	private String model;
	private String serialNum;
	private String color;
	private String prodCompany;

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setCoast(int coast) {
		this.coast = coast;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setProdCom(String prodCompany) {
		this.prodCompany = prodCompany;
	}

	public String toString() {
		return "MyAppliance [height=" + height + ", width=" + width
				+ ", weight=" + weight + ", coast=" + coast + ", model="
				+ model + ", serialNum=" + serialNum + ", color=" + color
				+ ", prodCompany=" + prodCompany + "]";
	}

}
