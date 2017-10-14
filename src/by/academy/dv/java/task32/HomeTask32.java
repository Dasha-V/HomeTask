package by.academy.dv.java.task32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class HomeTask32 {

	public static void main(String[] args) {
		Random rand = new Random();

		try (DataOutputStream a = new DataOutputStream(new FileOutputStream(
				"D:/students/Dasha/numbers"));) {
			for (int i = 0; i < 20; i++) {
				a.writeInt(rand.nextInt());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		try (DataInputStream a = new DataInputStream(new FileInputStream(
				"D:/students/Dasha/numbers"));) {
			for (int i = 0; i < 20; i++) {
				
				int readInt = a.readInt();
				
				System.out.println(readInt);
  
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
