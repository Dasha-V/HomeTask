package scheduletask.one;

public class GrammConverter implements Converter {
	@Override
	public void toConvert(double x) {
		double lb = x * 0.00220462;
		double kilo = x * 0.001;
		double carat = x * 5;
		System.out.println(String.format("%s lb, %s kilo, %s carat, %s gramm",
				lb, kilo, carat, x));

	}

}
