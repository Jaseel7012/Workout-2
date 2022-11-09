import java.util.Scanner;

public class CallByReferenceSwap {

    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    int b=sc.nextInt();
    void swap(CallByReferenceSwap o){
        int t=a;
        a=b;
        b=t;

    }

    public static void main(String[] args) {
        System.out.println("enter 2 numbers");
        CallByReferenceSwap o=new CallByReferenceSwap();
        System.out.println("before swap \n"+"a="+o.a+" b=" +o.b);
        o.swap(o);
        System.out.println("after swap \n"+"a="+o.a+" b=" +o.b);
    }
}
