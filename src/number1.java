import java.util.*;

public class number1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Digits between 0 to 9");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("The greatest possible number is " + a + b + c);
                System.out.println("The smallest possible number is " + c + b + a);
            } else {
                System.out.println("The greatest possible number is " + a + c + b);
                System.out.println("The smallest possible number is " + b + c + a);
            }

        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("The greatest possible number is " + b + a + c);
                System.out.println("The smallest possible number is " + c + a + b);
            } else {
                System.out.println("The greatest possible number is " + b + c + a);
                System.out.println("The smallest possible number is " + a + c + b);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println("The greatest possible number is " + c + a + b);
                System.out.println("The smallest possible number is " + b + a + c);
            } else {
                System.out.println("The greatest possible number is " + c + b + a);
                System.out.println("The smallest possible number is " + a + b + c);
            }
        }

    }
}

