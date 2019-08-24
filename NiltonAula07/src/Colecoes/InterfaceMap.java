package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class InterfaceMap {

	public static void main(String[] args) {
		Map<Integer, Object> map = new HashMap<>();

		map.put(1, "Duke1");
		map.put(2, "Duke2");
		map.put(3, "Duke3");

		System.out.println(map + ", size =" + map.size());

		map.get(1);

	}
}
