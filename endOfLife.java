
import java.util.*;

 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
           
            int lineCounter = 1;
           while (sc.hasNext()){
               String n = sc.nextLine();
                System.out.println(lineCounter + " " + n);
                lineCounter ++ ;
            }
            sc.close();
            
    }
}