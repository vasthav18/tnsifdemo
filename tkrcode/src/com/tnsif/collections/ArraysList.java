package com.tnsif.collections;
import java.util.ArrayList;
public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(101);
		al.add("shahsi");
		al.add(89.3); 
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.get(0));
		al.add("keerthi");
		al.add(null);
		al.add(101);
		System.out.println(al);
	}

}
