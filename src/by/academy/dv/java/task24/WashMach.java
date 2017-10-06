package by.academy.dv.java.task24;

public class WashMach extends ElectricalApp {

	private String dowTipe;
	private int spinSpeed;

	public WashMach(int height, int width, int weight, int coast, String model,
			String serialNum, String color, String prodCom, int power,
			int energySaving, String dowTipe, int spinSpeed) {
		super(height, width, weight, coast, model, serialNum, color, prodCom,
				power, energySaving);
		this.dowTipe = dowTipe;
		this.spinSpeed = spinSpeed;
	}

	public void printOllCha_csOfWasMach() {
		String str = String.format("тип загрузки= %s, скорость отжима = %s",
				dowTipe, spinSpeed);
		System.out.println(str);

	}
}