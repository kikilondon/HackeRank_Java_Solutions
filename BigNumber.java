import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean result;
        String n = bufferedReader.readLine();
        BigInteger bigInt = new BigInteger(n);
        result = bigInt.isProbablePrime(1);
        
        if (result == true)
        System.out.println("prime");
        else 
          System.out.println("not prime");

        bufferedReader.close();
    }
        
    }

