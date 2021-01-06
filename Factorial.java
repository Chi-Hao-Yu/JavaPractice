package method;

public class Factorial {
public static void factorial(int x) {
	int i=x;int j=1;
	while(i>0)
		j*=i--;
	System.out.println(x+"! ="+j);
}

public static void main(String[] args) {
	factorial(6);
	factorial(9);
	factorial(10);
}
}
