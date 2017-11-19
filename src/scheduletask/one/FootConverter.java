package scheduletask.one;

public class FootConverter implements Converter {

	@Override
	public void toConvert(double x) {
		double meter = x * 0.3048;
		double yard = x * 0.333333;
		double mile = x * 0.000189394;
		System.out.println(String.format("%s meter, %s yard, %s mile, %s foot",
				meter, yard, mile, x));

	}

}
