package by.academydv.java.task24;

public class TestAppliances {

	public static void main(String[] args) {

		Appliances cofemolca = new Appliances(20, 15, 1, 15, "������", "�1236",
				"�������", "LG");
		cofemolca.printOllCha_cs();
		ElectricalApp vacuumCleaner = new ElectricalApp(50, 50, 5, 100, "St7",
				"L12364", "������", "Philips", 1000, 300);
		vacuumCleaner.printOllCha_cs();
		vacuumCleaner.printOllCha_csOfElectr();
		Freege freege = new Freege(50, 50, 5, 100, "St7", "L12364", "������",
				"Philips", 1000, 300, 50, 100);
		freege.printOllCha_csOffreege();
		WashMach washMach = new WashMach(50, 50, 5, 100, "St7", "L12364",
				"������", "Philips", 1000, 300, "�������", 100);
		System.out.println(washMach.plugged());
	}

}
