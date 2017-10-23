package by.academy.dv.java.task1P2;

public class Terminal {

	private int i;

	public Terminal(int i) {
		this.i = i;
	}

	public synchronized void handle(String product) {
		System.out.println(String
				.format("%s Terminal, %s Product ", i, product));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
