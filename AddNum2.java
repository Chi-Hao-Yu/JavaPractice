package method;
//p05-20多載-省略引數個數的add方法(使用省略號只能有一個而且必須置於最後面引數)
public class AddNum2 {
	public static void main(String[] args) {
		System.out.printf("%d%n",add());
		System.out.printf("%d%n",add(2,4));
		System.out.printf("%d%n",add(1,3,5));
		System.out.printf("%d%n",add(2,5,6,8));
	}
	static int add(int... a) {
		int sum=0;
		for (int i :a) {
			sum+=i;
		}
		return sum;
	}
}
