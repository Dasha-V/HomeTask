package by.academy.dv.java.task28;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task28 {

	public static void main(String[] args)

	{
		Random random = new Random();
		List<Mark> marks = new ArrayList<Mark>();
		for (int i = 1; i < 20; i++) {
			marks.add(new Mark("name" + i, random.nextInt(10)));

		}
		ListIterator<Mark> iterator = marks.listIterator();

		Mark mmaxMark = null;
		while (iterator.hasNext()) {
			Mark currentMark = (Mark) iterator.next();
			if (mmaxMark == null || mmaxMark.getMark() < currentMark.getMark()) {
				mmaxMark = currentMark;
				
			}
	

		}
		
	}

}
