package by.academy.dv.java_31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HomeTask31_1 {

	public static void main(String[] args) throws IOException {

		File fileWithInts = new File("C:/Users/User/workspace/task31.txt");
		fileWithInts.createNewFile();

		FileWriter withints = new FileWriter(fileWithInts);
		withints.write(" 12 jgte 56 jutd 987 222");
		withints.write(" 555 7 2 7 jdse 885 gfdss 777");
		withints.close();

		int sum = 0;
		Path filePath = Paths.get("C:/Users/User/workspace/task31.txt");
		Scanner scanner = new Scanner(filePath);
		List<Integer> integers = new ArrayList<>();
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				integers.add(scanner.nextInt());
			} else {
				scanner.next();
			}

		}
		System.out.println(integers);
		scanner.close();
		for (Integer integer : integers) {
			sum += integer;

		}
		System.out.println(sum);
		Set<Integer> list2 = new HashSet<Integer>();
		list2.addAll(integers);
		integers.clear();
		integers.addAll(list2);
		System.out.println(integers);

	}

}
