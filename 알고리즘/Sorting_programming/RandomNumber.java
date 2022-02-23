package Sorting_programming;

public class RandomNumber {
	static double x =(System.currentTimeMillis()%1000);		
	double a=654321237;
	final long c=12345;
	final double m=1024;
	
	double rand() {
		this.x=((x*a)+c)%m+4;
		return x;
	}
	
	
}