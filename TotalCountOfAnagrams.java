package co.algs.in.strings;

import java.util.HashSet;

public class TotalCountOfAnagrams {
	public static int count(String str) {
		// base condition
		if (str.length() == 1) {
			return 1;
		}
		int total = 0;
		HashSet<Character> set = new HashSet<>();

		for (int index = 0; index < str.length(); index++) {
			Character val = str.charAt(index);
			if (!set.contains(val)) {
				if (index == 0) {
					total += count(str.substring(index+1));
				} else {
					String temp = str.substring(0,index) + str.substring(index+1, str.length());
					total += count(temp);
				}
				set.add(val);
			}
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println(count("aaca"));
	}
}
