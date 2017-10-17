package by.academy.dv.java.task33;

import java.io.File;

public class HomeTask33 {

	public static void main(String[] args) {
		File dir = new File("C:/Windows");
		File[] filesList = dir.listFiles();
		for (File file : filesList) {
			System.out.println(String.format(
					"name=%s, isderictory=%s, size=%s", file.getName(),
					file.isDirectory(), file.length()));

		}
	}

}
