
import java.util.*;
class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String [] tokens = s.split("[ !,?._'@]+");//split the string 
        //where the regex elements are. The split can create empty tokens.
        
        // Filter out empty strings
        List<String> nonEmptyTokens = new ArrayList<>();//create a new array in which store
        //the non empty tokens. 
        for (String token : tokens) {//iterate on the array
            if (!token.isEmpty()) {// if the token is not empty
                nonEmptyTokens.add(token);// store it in the new array
            }
        }

        // Convert the list back to an array
        tokens = nonEmptyTokens.toArray(new String[0]);

        System.out.println(tokens.length);
     
        
        for(String token : tokens){
            System.out.println(token);// print each token
        }
        scan.close();
    }
}


