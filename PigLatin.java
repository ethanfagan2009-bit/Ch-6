import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(pig(in.nextLine()));
	
	}
	public static String add(String word) {
		if(word.length()<=2) return word;
		return word.substring(1)+word.substring(0,1)+"ay";
	}
	
	public static String pig(String str) {
		String word="";
		String result="";
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)!=' '){
				word+=str.charAt(i);		
			} else {
				result+=add(word);
				result+=" ";
				word="";
			}
		}

		if(word.length()>0) {result+=add(word);}
		return result;
	}
	
}
