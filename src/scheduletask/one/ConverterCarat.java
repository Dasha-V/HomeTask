package scheduletask.one;

public class ConverterCarat implements Converter {

	@Override
	public void toConvert(double x) {
		double gramm = x * 0.2;
		double kilo = x * 0.0002;
		double lb = x * 0.00045925;
		System.out.println(String.format("%s kilo, %s lb, %s gramm, %s carat",
				kilo, lb, gramm, x));

	}

}
