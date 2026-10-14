public class Gauss {
	public static void main(String[] args) {
	System.out.println(gauss(4,1000));
	System.out.println(Math.exp(-4));
	}
	
	public static double gauss(double n, double x) {
		double sum=0;
		double ioral=1;
		for(int i=1; i<n; i++) {
			ioral*=i;
			sum+=(exp(-1,i)*exp(x,2*i))/ioral;
		}
		return sum;
		
	}
	public static double exp(double n, double x) {
		double result=n;
		for(int i=1; i<x; i++) {
			result*=n;
		}
		return result;
	}
	
	
}
