package scheduletask.one;

public class YardConverter implements Converter {

	@Override
	public void toConvert(double x) {
		double meter = x * 0.9144;
		double mile = x * 0.000568182;
		double foot = x * 3;
		System.out.println(String.format("%s meter, %s mile, %s foot, %s yard",
				meter, mile, foot, x));

	}

}
