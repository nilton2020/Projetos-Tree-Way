package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class IntefaceSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Duke");
		set.add("Duke");
		set.add("Duke");
		
		System.out.println(set + ", size =" + set.size());
		
		for (String string : set) {
			System.out.println(string);
		}
		
	}

}
