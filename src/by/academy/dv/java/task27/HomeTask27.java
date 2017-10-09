package by.academy.dv.java.task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

import javax.swing.JSpinner.ListEditor;

public class HomeTask27 {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			Integer randNum = random.nextInt(10);
			list.add(randNum);
			System.out.println(list.get(i));
		}
		Set<Integer> list2 = new HashSet<>();
		list2.addAll(list);
		list.clear();
		list.addAll(list2);
		System.out.println(list);

	}
}
