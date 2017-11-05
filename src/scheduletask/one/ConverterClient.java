package scheduletask.one;

public class ConverterClient {
	Converter converter;
	double x;

	public void toChoseConverter(String condition) {
		if (condition.equals("кг")) {
			converter = new ConverterKilo();
			converter.toConvert(x);
		} else if (condition.equals("грамм")) {
			converter = new ConverterGramm();
			converter.toConvert(x);
		} else if (condition.equals("фунт")) {
			converter = new ConverterLb();
			converter.toConvert(x);
		} else if (condition.equals("карат")) {
			converter = new ConverterCarat();
			converter.toConvert(x);
		} else if (condition.equals("метр")) {
			converter = new ConverterMeter();
			converter.toConvert(x);
		} else if (condition.equals("миля")) {
			converter = new ConverterMile();
			converter.toConvert(x);
		} else if (condition.equals("ярд")) {
			converter = new ConverterYard();
			converter.toConvert(x);
		} else if (condition.equals("фут")) {
			converter = new ConverterFoot();
			converter.toConvert(x);
		}
	}

	public ConverterClient(double x) {
		super();
		this.x = x;
	}

}