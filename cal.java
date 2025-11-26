import java.util.Scanner;

public class cal{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a ,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        System.out.println("add is "+c);
        System.out.println("sub is "+d);
        c=a*b;
        d=a/b;
        System.out.println("mul is "+c);
        System.out.println("div is "+d);
    }
}