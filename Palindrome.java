import java.util.Scanner;


public class Palindrome{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(pal(str));
	}
	
	public static boolean pal(String str) {
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		String string="";
		str=str.toLowerCase();
		for(int i=1;i<=str.length();i++) {
			String y = str.substring(i-1, i);
			if(!nonLetters.contains(y)) {
				string+=y;
			}
		}
		String newstring="";
		for(int i=string.length()-1;i>=0;i--) {
			String x = string.substring(i, i+1);
			if(!nonLetters.contains(x)) {
				newstring+=x;
			} 
		}
		System.out.println(newstring);
		System.out.println(string);
		if(string.equals(newstring)) {
			return true;
		} else { 
			return false;
		}
	}
	
}
