package by.academydv.java.task25;

public class Card {
	
	private int cardNum;
	private String validthru;
	private String nameOfOwner;
	private String tipe;
	private int cvvCode;
	private double cash;
	
	
	public double repAccount (double sum){
	return cash+sum;	
	}


	public int getCardNum() {
		return cardNum;
	}


	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}


	public String getValidthru() {
		return validthru;
	}


	public void setValidthru(String validthru) {
		this.validthru = validthru;
	}


	public String getNameOfOwner() {
		return nameOfOwner;
	}


	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
	}


	public String getTipe() {
		return tipe;
	}


	public void setTipe(String tipe) {
		this.tipe = tipe;
	}


	public int getCvvCode() {
		return cvvCode;
	}


	public void setCvvCode(int cvvCode) {
		this.cvvCode = cvvCode;
	}


	public double getCash() {
		return cash;
	}


	public void setCash(double cash) {
		this.cash = cash;
	}


	public Card(int cardNum, String validthru, String nameOfOwner,
			String tipe, int cvvCode, double cash) {
		super();
		this.cardNum = cardNum;
		this.validthru = validthru;
		this.nameOfOwner = nameOfOwner;
		this.tipe = tipe;
		this.cvvCode = cvvCode;
		this.cash = cash;
	}
	
	public Card(){};

	
	
}
