import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int str = in.nextInt();
	con(str);
	}
	
	public static void reverse(String str) {
		String rev="";
		for(int i=str.length(); i>0; i--) {
			String letter= str.substring(i-1,i);
			rev+=letter;
		}
		System.out.println(rev);
	}
	
	public static void con(int n) {
		String word = "";
		while (n>0) {
			if(n%2==0) {
				word+='0';
			}
			if(n%2==1) {
				word+='1';
			}
			n=n/2;
		}
		reverse(word);
	}
}
