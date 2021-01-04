package helloworld;

public class Stairs {
public static void main(String[] args) {
	printStairs(5);
}
public static void printStairs(int n) {
	if(n<1) {
		System.out.println("n必須大於0");
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
