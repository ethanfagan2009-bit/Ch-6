import java.util.Scanner;

public class PPAP {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String first= str.substring(8,str.indexOf(','));
		String second= str.substring(str.indexOf('a', str.indexOf(',')+7)+1, str.length());
		pp(first,second);
	}
	public static void pp(String obj1, String obj2) {
		System.out.println("Uh! " + obj1+obj2); 

	}
	
	
}
