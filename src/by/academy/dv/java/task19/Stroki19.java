package by.academy.dv.java.task19;

public class Stroki19 {

	public static void main(String[] args) {
		String str = "  Любая строчка с текстом  ";
		String str2 = str.trim();
		int n = 0;
		String[] words = str2.split(" ");
		

		for (int i=0;i<words.length;i++) {

			n++;
			
			
		}
		System.out.println(n);
		
	}
	
	
}
