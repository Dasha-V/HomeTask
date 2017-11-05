package scheduletask.one;
import java.util.Scanner;

public class TestConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите \"Масса\" или \"Расстояние\"");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("Масса")){
			System.out.print("Введите единицу измерения: кг карат фунт грамм ");}
		if (choice.equalsIgnoreCase("Расстояние")){
			System.out.print("Введите единицу измерения: метр миля ярд фут ");}

		String condition;
		condition = sc.nextLine();
		System.out.print("Введите число ");
		double x = sc.nextDouble();

		ConverterClient converter = new ConverterClient(x);
		converter.toChoseConverter(condition);

	}

}
