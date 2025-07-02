import java.util.*;
public class VariableTransformationChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 == 0) {
            a += b;
        }

        if (b % 2 != 0) {
            c *= 2;
        }

        if (c % 3 == 0) {
            c += a;
        }

        if ((a + b + c) > 100) {
            a -= 100;
            b -= 100;
            c -= 100;
        }

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}