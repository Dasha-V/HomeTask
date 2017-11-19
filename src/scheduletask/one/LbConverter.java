package scheduletask.one;

public class LbConverter implements Converter {

	@Override
	public void toConvert(double x) {
		double gramm = x * 453.592;
		double kilo = x * 0.453592;
		double carat = x * 2267.96;
		System.out.println(String.format("%s gramm, %s kilo, %s carat, %s lb",
				gramm, kilo, carat, x));

	}

}
