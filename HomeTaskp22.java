
public class HomeTaskp22 {

	public static void main(String[] args) {
		int day = 10;
		int m = 11;
		int year = 2017;
		int nextDay= ++day;
		int z = nextDay;
		if(z<9 && m<9)	
		System.out.println("0"+z + " �����, " + "0"+m + " �����, " + year+" ���.");
		else if (z<9 && m>9)
		System.out.println("0"+z +" �����, " + m + " �����, "+ year+" ���.");
		else if (z>9 && m<9)
			System.out.println(z +" �����, " + "0"+m + " �����, "+ year+" ���.");
		else System.out.println(z +" �����, " + m + " �����, "+ year+" ���.");
		
	}

}
