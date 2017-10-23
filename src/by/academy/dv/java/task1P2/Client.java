package by.academy.dv.java.task1P2;

public class Client extends Thread {

	private String[] products;
	private Terminal terminal;

	public Client(String[] products, Terminal terminal) {
		super();
		this.products = products;
		this.terminal = terminal;
	}

	public void run() {
		for (String string : products) {
			terminal.handle(string);

		}

	}

}
