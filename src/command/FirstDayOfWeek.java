package command;

public class FirstDayOfWeek implements Command {
	WeekDay weekDay;

	public FirstDayOfWeek(WeekDay weekDay) {
		this.weekDay = weekDay;
	}

	@Override
	public void execute() {
		weekDay.print1DayOfWeek();

	}

}
