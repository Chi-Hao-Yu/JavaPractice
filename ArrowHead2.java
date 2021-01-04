package helloworld;

public class ArrowHead2 {
public static void main(String[] args) {
	printArrow(2,5);
}
public static void printArrow(int d, int n) {
    if (n < 1) {
        System.out.println("要大於0");
    }

    for (int i = 0; i < n; i++) { // 第一層迴圈負責印斷行(\n)
        for (int j = 0; j <= i; j++) { // 第二層迴圈負責印星號(*)
            if (j == 0) {
                System.out.print("*");
            } else if (j > 0) {
                for (int k = 0; k < d; k++) {
                    System.out.print("*");
                }
            }
        }
        System.out.print("\n");
    }

    for (int i = 1; i < n; i++) { // 第一層迴圈負責印斷行(\n)
        for (int j = (n - i); j > 0; j--) { // 第二層迴圈負責印星號(*)
            if (j > 1) {
                for (int k = 0; k < d; k++) {
                    System.out.print("*");
                }
            } else if (j == 1) {
                System.out.print("*");
            }
        }
        System.out.print("\n");
    }
}
}