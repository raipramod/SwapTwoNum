import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        //you are given two different numbers and swap them lets say a=20 and b=9. after swap, a=9. n=20

     int a,b,c;
        System.out.println("Please enter two numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swapping "+a+" "+b);
        c=a+b; //c=20+9=29
        b=c-b; //b=29-9=20
        a=c-b; //a=20-29=9

        System.out.println("After swappping "+a+" "+b);
    }
}
