package helloworld;

public class ArrowHead {
public static void main(String[] args) {
	printArrowHead(10);
}
public static void printArrowHead(int n) {
	if(n<1) {
		System.out.println("n必須大於0");
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<n;i++) {
		for(int j=(n-i);j>0;j--) {
			System.out.print("*");
		}System.out.println();
	}
}
}
