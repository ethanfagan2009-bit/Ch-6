public class SquareRoot {
	public static void main(String[] args) {
	System.out.println(squareroot(9, 4));
	}
	public static double squareroot(double n, double guess) {
		double sqr=0;
		for(int i=0; i<=100000; i++) {
			sqr=(guess+n/guess)/2.0;
		}
		return sqr;
	}
}
