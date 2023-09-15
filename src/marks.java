import java.util.*;
public class marks
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you name");
        String name;
        name=sc.nextLine();
        System.out.println("Enter your marks");
        System.out.println("First Subject");
        int fs;
        fs=sc.nextInt();
        System.out.println("Second subject");
        int Ss;
        Ss=sc.nextInt();
        System.out.println("Third Subject");
        int ts;
        ts=sc.nextInt();
        System.out.println("Fourth subject");
        int Fos;
        Fos=sc.nextInt();
        System.out.println("gitFifth subject");
        int Fis;
        Fis=sc.nextInt();
        double total=fs+Ss+ts+Fos+Fis;
        double percentage=total/500*100;
    ;
        if(percentage>=80)
        {
            System.out.println(name+" Got Distinction");
        }
        else if(percentage>=70&&percentage<80)
        {
            System.out.println(name+" Got First Honours");

        }
        else if(percentage>=60&&percentage<70)
        {
            System.out.println(name+" Got Second honours");

        }
        else
            System.out.println(name+" Got No Honours");


    }
}