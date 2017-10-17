package by.academy.dv.java.task24;

public class Applianc {

	private int height;
	private int width;
	private int weight;
	private int coast;
	private String model;
	private String serialNum;
	private String color;
	private String prodCom;

	public Applianc(int height, int width, int weight, int coast,
			String model, String serialNum, String color, String prodCom) {
		super();
		this.height = height;
		this.width = width;
		this.weight = weight;
		this.coast = coast;
		this.model = model;
		this.serialNum = serialNum;
		this.color = color;
		this.prodCom = prodCom;
	}

	public void printOllCha_cs() {
		String str = String
				.format("высота см:=%s,ширина см:=%s,вес кг:= %s, стоимость USD:=%s,модель: = %s, серийный номер:=%s,цвет:=%s,компания производитель:=%s",
						height, width, weight, coast, model, serialNum, color,
						prodCom);
		System.out.println(str);

	}

	public Applianc() {
		super();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCoast() {
		return coast;
	}

	public void setCoast(int coast) {
		this.coast = coast;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProdCom() {
		return prodCom;
	}

	public void setProdCom(String prodCom) {
		this.prodCom = prodCom;
	}

}
