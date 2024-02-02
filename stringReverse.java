
import java.util.*;

 class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverseString= "";
        int Alength= A.length();
        
        for (int i = (Alength -1); i >=0;--i){
            reverseString = reverseString + A.charAt(i);
            //if(A.toLowerCase().equals(reverseString.toLowerCase())){
        }
                if(A.equals(reverseString)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
             sc.close();
        }
      
    }