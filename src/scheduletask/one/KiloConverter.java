package scheduletask.one;

public class KiloConverter implements Converter {

	@Override
	public void toConvert(double x) {
		double lb = x * 2.20462;
		double gramm = x * 1000;
		double carat = x * 5000;
		System.out.println(String.format("%s lb, %s gramm, %s carat, %s kilo",
				lb, gramm, carat, x));
	}
}