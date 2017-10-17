package by.academy.dv.java.task21;

public class HomeTask21and2 {

	public static void main(String[] args) {
		
		final long timeStringStart = System.currentTimeMillis();
		StringBuffer stringbuffer = new StringBuffer();
	     for (int i = 0; i <= 10000; i++) {
	         stringbuffer.append(i);

	     }
	     final long timeStringEnd = System.currentTimeMillis();

	     System.out.println("the final string:" + stringbuffer);
	     System.out.println("spent time:" + (timeStringEnd - timeStringStart));


	}

}

