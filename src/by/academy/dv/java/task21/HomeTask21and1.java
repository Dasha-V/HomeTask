package by.academy.dv.java.task21;

public class HomeTask21and1 {

	public static void main(String[] args) {
		final long timeStringStart = System.currentTimeMillis();

	     String str = "";
	     for (int i = 0; i <= 10000; i++) {
	         str += i;

	     }
	     final long timeStringEnd = System.currentTimeMillis();

	     System.out.println("the final string:" + str);
	     System.out.println("spent time:" + (timeStringEnd - timeStringStart));


	}

}
