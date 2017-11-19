package scheduletask.one;

public class ClientConverter {
	private Converter converter;
	private double x;

	public void toChoseConverter(String condition) {
		if ("кг".equals(condition)) {
			converter = new KiloConverter();
			converter.toConvert(x);
		} else if ("грамм".equals(condition)) {
			converter = new GrammConverter();
			converter.toConvert(x);
		} else if ("фунт".equals(condition)) {
			converter = new LbConverter();
			converter.toConvert(x);
		} else if ("карат".equals(condition)) {
			converter = new CaratConverter();
			converter.toConvert(x);
		} else if ("метр".equals(condition)) {
			converter = new MeterConverter();
			converter.toConvert(x);
		} else if ("миля".equals(condition)) {
			converter = new MileConverter();
			converter.toConvert(x);
		} else if ("ярд".equals(condition)) {
			converter = new YardConverter();
			converter.toConvert(x);
		} else if ("фут".equals(condition)) {
			converter = new FootConverter();
			converter.toConvert(x);
		}
	}

	public ClientConverter(double x) {
		super();
		this.x = x;
	}

}