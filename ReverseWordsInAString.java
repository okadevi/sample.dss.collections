package co.algs.in.strings;

public class ReverseWordsInAString {
	/**
	 * Complexity O(n)
	 * @param str Input String that needs to be reversed word by word
	 * @return Reverse of input string(str)
	 */
	public static String execute(String str) {
		StringBuilder reverse = new StringBuilder(),
				word = new StringBuilder(),
				space = new StringBuilder();// this won't create new string which occur in appending 

		for(int index = str.length() - 1; index >= 0; index--) {
			char value = str.charAt(index);

			if (value != ' ') {
				word.append(value);
			} else {
				space.append(value);
			}

			if (index == 0 || (space.length() != 0 ) ) {
				if (word.length()!= 0) {
					reverse.append(word.reverse()).append(space);
				} else {
					reverse.append(space);
				}			
				word.replace(0, word.length(), "");
				space.replace(0, space.length(), "");
			}
		}
		return reverse.toString();		
	}

	public static void main(String[] args) {
		String str = "I like12 this's program  very    much";
		System.out.println(execute(str));
	}
}
