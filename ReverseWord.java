package co.algs.in.strings;

public class ReverseWord {
	
	public static String execute (String str) {
		if (str.length() == 1) {
			return str;
		} 
		String result = "";
		return result = execute(str.substring(1, str.length() ))+str.charAt(0) ;
	}
	
	public static void main(String[] args) {
		System.out.println(execute("abcd"));
	}
}
