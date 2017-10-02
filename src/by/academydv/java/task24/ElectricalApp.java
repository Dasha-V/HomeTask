package by.academydv.java.task24;

public class ElectricalApp extends Appliances {
	private int power;
	private int energySaving;

	public ElectricalApp(int height, int width, int weight, int coast,
			String model, String serialNum, String color, String prodCom,
			int power, int energySaving) {
		super(height, width, weight, coast, model, serialNum, color, prodCom);
		this.power = power;
		this.energySaving = energySaving;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getEnergySaving() {
		return energySaving;
	}

	public void setEnergySaving(int energySaving) {
		this.energySaving = energySaving;
	}

	public void printOllCha_csOfElectr() {
		String str = String.format("Мощность = %s, Энергосбережение = %s",
				power, energySaving);
		System.out.println(str);

	}

	public boolean plugged() {
		return true;
	};

}
