
import java.util.*;
// import java.math.BigInteger;


public class BigIntegers{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);
   
        String strA= scanner.nextLine();
        String strB= scanner.nextLine();
        
        BigInteger a = new BigInteger(strA);
        BigInteger b = new BigInteger(strB);
        
        BigInteger sum = a.add(b);
        BigInteger mult = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(mult);
     
    }
}