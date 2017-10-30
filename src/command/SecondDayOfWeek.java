package command;

public class SecondDayOfWeek implements Command {
	WeekDay weekDay;

	public SecondDayOfWeek(WeekDay weekDay) {
		this.weekDay = weekDay;
	}

	@Override
	public void execute() {
		weekDay.print2DayOfWeek();
	}

}
