
import java.util.Scanner;

public class day {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    switch(day) {
        case 1:
        System.out.println("sunday");
        break;
        case  2:
        System.err.println("monday");
        break;
        case 3:
        System.out.println("tuesday");
        break;
        case 4:
        System.err.println("wednesday");
        break;
        case 5:
        System.out.println("Thrusday");
        break;
        case 6:
        System.out.println("friday");
        break;
        case 7:
        System.out.println("saturday");
        break;
        default:
        System.out.println("invalid day");



        
    }
}    
}
