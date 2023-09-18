import java.util.*;
public class loop {
    public static  void main(String args[])
    {
     Scanner sc =new Scanner(System.in);
     int i=0;
 for ( i=1;i<=10;i++) {
     int a;
     System.out.println("enter a number"+i+++":");
     a=sc.nextInt();
     if (a%2==0)
         System.out.println("The even numbers are "+a);
     else
         System.out.println("The number is not even ");

    }
    }
}
