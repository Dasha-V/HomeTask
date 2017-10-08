package by.academy.dv.java.task26;

import java.util.ArrayList;
import java.util.List;


import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HomeTask26 {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(9);
		marks.add(6);
		marks.add(7);
		marks.add(1);
		marks.add(1);
		marks.add(5);
		marks.add(3);
		for (Integer val : marks) {
			System.out.println("mark" + val);}

		ListIterator<Integer> listIter=marks.listIterator();
		while(listIter.hasNext()){
			if (listIter.next()<=3){
				listIter.remove();
			}
		}
		
		    	
		System.out.println(marks);
		}
}
