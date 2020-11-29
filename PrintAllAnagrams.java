package co.algs.in.strings;

import java.util.ArrayList;
import java.util.List;

public class PrintAllAnagrams {
	public static List<String> show(String str) {
		List<String> result = new ArrayList<>();
	
		if (str.length() == 1) {
			result.add(str);
			return result;
		}		
		
		for(int index = 0; index < str.length(); index++) {
			String temp = (index == 0) ? str.substring(index+1) : 
				 str.substring(0,index) + str.substring(index+1); // temp is substring
			
			List<String> subStringList =  show(temp);
			for(String item: subStringList) {
				result.add(str.charAt(index)+""+item);
			}			
		}		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(show("abc"));
	}
}
