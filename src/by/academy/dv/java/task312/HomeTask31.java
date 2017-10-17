package by.academy.dv.java.task312;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeTask31 {


	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("D:/students/Dasha/text.txt");
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		while (line != null) {
			sb.append(line).append("\n");
			line = buf.readLine();
		}
		String fileAsString = sb.toString();
		System.out.println("Contents : " + fileAsString);
		int sum = 0;
		List<Integer> integersList = new ArrayList<Integer>();
		for (int i = 0; i < fileAsString.length(); i++) {

			char charAt = fileAsString.charAt(i);
			String str = String.valueOf(charAt);

			try {
				Integer valueOf = Integer.valueOf(str);
				integersList.add(valueOf);

			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		for (Integer integer : integersList) {
			sum += integer;
		}
        Set <Integer> hs =new HashSet<Integer>();
        hs.addAll(integersList);
        System.out.println(hs);
	}
}
