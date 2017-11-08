package scheduletask.six;

public class SomeClass {

	public static void main(String[] args) {
		int b = 7;
		int v = 120;
		ConverterMillis converterMillis = new ConverterMillis();
		long s = converterMillis.connvertToMillis("hour", b);
		long ss = converterMillis.connvertToMillis("minutes", v);
		System.out.println(s + " " + ss);
		long sss = s + ss;
		TimeClass timeClass = new TimeClass();
		timeClass.toDoTime(sss);

		
		for (int i = 1; i < 10 - 1; i++) {

			int start = 7;
			int h = i;
			int g = (start + h);
			
			System.out.println(g);

		}

	}
}
