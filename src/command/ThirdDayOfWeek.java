package command;

public class ThirdDayOfWeek implements Command {
	WeekDay weekDay;

	public ThirdDayOfWeek(WeekDay weekDay) {
		this.weekDay = weekDay;
	}

	@Override
	public void execute() {
		weekDay.print3DayOfWeek();
	}

}
