package by.academy.dv.java.task25;

public class CardCredit extends Card {
	private double creditRateInYear;
	private double creditPeriod;
	private double sumOfcredit;

	public void OsnovnoyDolgMes(double sumOfcredit, double creditPeriod) {
		this.sumOfcredit = sumOfcredit;
		this.setCreditPeriod(creditPeriod);
		double z = sumOfcredit / creditPeriod;
		System.out.println("Сумма основного долга в месяц " + z);
	}

	public void percOfFirstMon(double sumOfcredit, double creditRateInYear,
			double mons, double year) {
		this.sumOfcredit = sumOfcredit;
		this.creditRateInYear = creditRateInYear;
		double h = (sumOfcredit * (creditRateInYear / 100)) * (mons / year);
		System.out.println("% начисляемый в первый месяц " + h);
	}

	public CardCredit(double creditRateInYear, double creditPeriod,
			double sumOfcredit) {

		this.creditRateInYear = creditRateInYear;
		this.setCreditPeriod(creditPeriod);
		this.sumOfcredit = sumOfcredit;
	}

	public double getCreditPeriod() {
		return creditPeriod;
	}

	public void setCreditPeriod(double creditPeriod) {
		this.creditPeriod = creditPeriod;
	}

	public double getCreditRateInYear() {
		return creditRateInYear;
	}

	public void setCreditRateInYear(double creditRateInYear) {
		this.creditRateInYear = creditRateInYear;
	}

	public double getSumOfcredit() {
		return sumOfcredit;
	}

	public void setSumOfcredit(double sumOfcredit) {
		this.sumOfcredit = sumOfcredit;
	}

}
