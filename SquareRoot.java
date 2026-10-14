public class SquareRoot {
	public static void main(String[] args) {
	System.out.println(squareroot(9, 4.5));
	}
	public static double squareroot(double n, double guess) {
		
		while(Math.abs(Math.pow(guess,2)-n)>=0.0001) {
			guess=(guess+n/guess)/2.0;
		}
		return guess;
	}
}
