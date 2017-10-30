package commandvartwo;

public class Client {

	Command command;

	public void toChooseDay(int n) {
		if (n == 1) {
			command = new FirstDayOfWeek();
			command.execute();

		} else if (n == 2) {
			command = new SecondDayOfWeek();
			command.execute();

		} else if (n == 3) {
			command = new ThirdDayOfWeek();
			command.execute();
		}

	}
}