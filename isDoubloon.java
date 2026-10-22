public class isDoubloon {
	public static void main(String[] args) {
		System.out.println(word("ssabab"));
	}
	
	public static boolean word(String str) {
		boolean check=false;
		for(int i=0; i<str.length(); i++) {
			char n =str.charAt(i);
			System.out.println(n);
			
			if(str.indexOf(n)==i) {
				if(str.indexOf(str.indexOf(n)+1)>0) {
					check=true;
				} //else check=false;
			} //else if (str.indexOf(n)>0) {
				//check=true;
			//} else check=false;
		}
		return check;
	}
}
