import java.util.*;

public class number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            if (b > c)
                System.out.println(b + "Is the second greatest number");
            else
                System.out.println(c + "Is the second greatest number");
        } else if (b > a && b > c) {
            if (a > c)
                System.out.println(a + "Is the second greatest number");
            else
                System.out.println(c + "Is the second greatest number");
        } else if (c > a && c > b) {
            if (b > a)
                System.out.println(b + "Is the second greatest number ");
            else
                System.out.println(a + "Is the second greatest number");
        } else
            System.out.println("The given numbers are equal");
    }


}






