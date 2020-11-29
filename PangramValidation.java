package co.algs.in.strings;

import java.util.HashSet;

public class PangramValidation {	
		
	public static void execute(String str) {
		HashSet<Character> sett = new HashSet<>();
		
		for(int index = 0; index < str.length() && sett.size() < 52; index++) {
			char value = str.charAt(index);
			if ( !sett.contains(value) &&
					(value >= 'a' && value <='z') ||
					 (value >= 'A' && value <= 'Z') 
					) {
				sett.add(value);
			}		
		}
		
		if (sett.size() == 52) {
			System.out.println("It is Pangram");
		} else {
			System.out.println("It is not Pangram");
		}
	}
	
	//test
	public static void main(String[] args) {
		String str = "A B C D EG FGHIJKLMNOPQRSTUVWZXYZ , abcde fghijkqwrlmnopqrstuvwxzyz";
		execute(str);
	}
	
}
