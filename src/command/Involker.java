package command;

public class Involker {
	Command print1DayOfWeek;
	Command print2DayOfWeek;
	Command print3DayOfWeek;

	public Involker(Command print1DayOfWeek, Command print2DayOfWeek,
			Command print3DayOfWeek) {

		this.print1DayOfWeek = print1DayOfWeek;
		this.print2DayOfWeek = print2DayOfWeek;
		this.print3DayOfWeek = print3DayOfWeek;
	}

	public void print1Day() {
		print1DayOfWeek.execute();
	}

	public void print2Day() {
		print2DayOfWeek.execute();
	}

	public void print3Day() {
		print3DayOfWeek.execute();
	}
}
