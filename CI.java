//Compound Interest calculator which accepts user input.
import java.util.Scanner;
public class CI{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int p = scanner.nextInt();
        System.out.print("Rate of Interest: ");
        int r = scanner.nextInt();
        System.out.print("Time Period: ");
        int t = scanner.nextInt();
        System.out.print("Time compounded: ");
        int n = scanner.nextInt();
        double ci = (p * Math.pow(1+ (r / (100.0 * n)), t * n)) - p;
        System.out.printf("The compound interest is: %.2f", ci);
        scanner.close();
    }
}