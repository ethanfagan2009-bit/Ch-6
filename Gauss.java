public class Gauss {
	public static void main(String[] args) {
	System.out.println(gauss(10,1));
	System.out.println(Math.exp(-1));
	}
	
	public static double gauss(double n, double x) {
		double np=1;
		double exp=1;
		double sum=0;
		double ioral=1;
		for(int i=0; i<n; i++) {
			sum+=(np*exp)/ioral;
			np*=-1;
			exp*=x*x;
			ioral*=i+1;
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
