package by.academy.dv.java.task1P2;

public class TestClient {

	// private String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};

	public static void main(String[] args) {

		Terminal terminal1 = new Terminal(1);
		Terminal terminal2 = new Terminal(2);

		Thread client = new Client(new String[] { "Cheese", "Pepperoni",
				"Black Olives" }, terminal1);
		Thread client2 = new Client(new String[] { "milk", "bread", "potato" },
				terminal2);
		Thread client3 = new Client(new String[] { "fish", "plum", "apple" },
				terminal1);
		client.start();
		client2.start();
		client3.start();

	}
}
