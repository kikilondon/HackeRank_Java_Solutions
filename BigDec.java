import java.math.BigDecimal;
import java.util.Scanner;

public class BigDec {
    public static void main(String[] args) {
        
          //create input array
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();//store  strings in the array 
        }
        sc.close();// close scanner

        // Sorting the array of real number strings in descending order using selection sort
        for(int i = 0; i < n; i++) {
          int maxIndex = i;// Assume the current element is the maximum

 // Find the index of the maximum element from the remaining unsorted elements
          for(int j = i+1; j < n; j++) {
                // Compare two real number strings as BigDecimals
              if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[maxIndex])) > 0) {
              maxIndex = j; // Update the index of the maximum element
        }
      }
       // Swap the current element with the maximum element found
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

    
    

