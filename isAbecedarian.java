public class isAbecedarian {
	public static void main(String[] args) {
		System.out.println(order("abc"));
	}
	
	public static boolean order(String str) {
		int n=0;
		boolean check=false;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)<str.charAt(i+1)) {
				n++;
				check=true;
			} else check=false;
			System.out.println(n);
			if(n==str.length()) {return true;}
		}
		return check;
	}
}
