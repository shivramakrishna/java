import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int a,b ,c;
        System.out.println("enter the first no");
        a=S.nextInt();
        System.out.println("enter the second no");
        b=S.nextInt();
        System.out.println("enter the choice");
        String choice=S.next();
        
        switch(choice){
            case "+":
                c=a+b;
                System.out.println(c);
                break;
            case "_":
                c=a-b;
                System.out.println(c);
                break;
            case "mul":
                c=a*b;
                System.out.println(c);
                break;
            case "div":
                c=a/b;
                System.out.println(c);
                break;
            default:
                System.out.println("invalid choice");
                break;
    
    }}}