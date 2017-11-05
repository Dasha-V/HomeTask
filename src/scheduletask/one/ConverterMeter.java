package scheduletask.one;

public class ConverterMeter implements Converter {

	@Override
	public void toConvert(double x) {
		double mile = x * 0.000621371;
		double yard = x * 1.09361;
		double foot = x * 3.28084;
		System.out.println(String.format("%s mile, %s yard, %s foot, %s meter",
				mile, yard, foot, x));

	}

}
