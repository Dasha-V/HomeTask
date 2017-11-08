package scheduletask.six;

public class ConverterMillis {

	public long connvertToMillis(String choice, int hourOrminuts) {

		if (choice.equals("hour")) {
			hourOrminuts = hourOrminuts * 3600000;

		} else if (choice.equals("minutes")) {
			hourOrminuts = hourOrminuts * 60000;

		}
		return hourOrminuts;

	}
}
