package scheduletask.one;

public class MileConverter implements Converter {

	@Override
	public void toConvert(double x) {
		double meter = x * 1609.34;
		double yard = x * 1760;
		double foot = x * 5280;
		System.out.println(String.format("%s meter, %s yard, %s foot, %s mile",
				meter, yard, foot, x));

	}

}
