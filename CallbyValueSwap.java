import java.util.Scanner;

public class CallbyValueSwap {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

     void swap(int a,int b){
        System.out.println("Before swapping (inside method)\n"+"a="+a+" b="+b);
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("After swapping (inside method)\n"+"a="+a+" b="+b);
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers,press enter after each number");
        CallbyValueSwap obj1=new CallbyValueSwap();
        System.out.println("Before swapping \n"+"a="+obj1.a+" b="+obj1.b);
        obj1.swap(obj1.a, obj1.b);
        System.out.println("After swapping  \n"+"a="+obj1.a+" b="+obj1.b);
    }
}
