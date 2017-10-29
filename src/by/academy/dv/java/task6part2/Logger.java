package by.academy.dv.java.task6part2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	public final static Logger LOG = new Logger();
	BufferedWriter writer;

	private Logger() {
		try {
			writer = new BufferedWriter(new FileWriter("D:/File"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	};

	public void log(String str) {
		try {
			writer.write(String.format("%s  %s", new Date(), str));
			writer.newLine();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	public void completeLogging() {
		try {
			writer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
