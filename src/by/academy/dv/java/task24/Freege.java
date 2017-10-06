package by.academy.dv.java.task24;

public class Freege  extends ElectricalApp{
	
	private int FreezVol;
	private int FreegeVol;
	public Freege(int height, int width, int weight, int coast, String model,
			String serialNum, String color, String prodCom, int power,
			int energySaving, int freezVol, int freegeVol) {
		super(height, width, weight, coast, model, serialNum, color, prodCom,
				power, energySaving);
		FreezVol = freezVol;
		FreegeVol = freegeVol;
	}
	
	public void printOllCha_csOffreege() {
		String str = String.format(
				"объем морозильной камеры = %s, объём холодильной камеры = %s",
				FreezVol, FreegeVol);
		System.out.println(str);	

	}

	
	
	
	

}
