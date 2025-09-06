//Compound interest calculator which inputs random valurs to calculate  ci.
import java.util.Random;
public class RandomCI{
    public static void main(String[] args){
       Random random = new Random();
       int p = random.nextInt(100, 10000);
       int r = random.nextInt(1, 20);
       int t = random.nextInt(1, 10);
       int n = random.nextInt(1, 4);
       double ci = (p * Math.pow(1+ (r / (100.0 * n)), t * n)) - p;
       System.out.println("Random principal used: " + p);
       System.out.println("Random rate of interest used: " + r);
       System.out.println("Random time period used: " + t);
       System.out.println("Random times compounded used: " + n);
       System.out.printf("The compound interest is: %.2f", ci);
    }
}