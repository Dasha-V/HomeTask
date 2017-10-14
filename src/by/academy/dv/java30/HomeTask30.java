package by.academy.dv.java30;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class HomeTask30 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/User/workspace/task30.txt");
		file.createNewFile();

		FileWriter filewriter = new FileWriter(file);
		filewriter.write("ткань; сплетение, связь, сочетание\n");
		filewriter.write("ткань; сплетение, связь, сочетание\n");
	
		filewriter.close();

	
		List<String> allLines = Files.readAllLines(
				Paths.get(file.getAbsolutePath()), Charset.defaultCharset());

		int wordsCount = 0;
		int delimeter = 0;
		for (String line : allLines) { 
			System.out.println(line);
			String[] splitResalt = line.split("(,| |;)+");
			wordsCount += splitResalt.length;

			Pattern pattern = Pattern.compile("(,| |;)");
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				delimeter++;

			}

		}
		System.out.println(delimeter);
		System.out.println("words " + wordsCount);
	}
}