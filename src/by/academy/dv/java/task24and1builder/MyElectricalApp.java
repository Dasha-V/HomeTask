package by.academy.dv.java.task24and1builder;

public class MyElectricalApp extends MyAppliance {

	private int power;
	private int energySaving;

	public void setPower(int power) {
		this.power = power;
	}

	public void setEnergySaving(int energySaving) {
		this.energySaving = energySaving;
	}

	@Override
	public String toString() {
		return "MyElectricalApp [power=" + power + ", energySaving="
				+ energySaving + ", toString()=" + super.toString();
	}

	public boolean plugged() {
		return true;
	};

}
