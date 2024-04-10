import java.math.BigDecimal;
import java.util.Scanner;

public class BigDec {
    public static void main(String[] args) {
        
          //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here  
        for(int i = 0; i < n; i++) {
          int maxIndex = i;
            for(int j = i+1; j < n; j++) {
              if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[maxIndex])) > 0) {
              maxIndex = j;
        }
      }
      String temp = s[i];
      s[i] = s[maxIndex];
      s[maxIndex] = temp;
    }
    
    // Print sorted array
    for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
     } 
}

    
    

