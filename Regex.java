
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
    String pattern = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";

}

//"\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";let's break down this :

//  \\b this at the end and beginning is a word bundary that check that the string is 
//not part of a larger sequence of characters tha might contain other periods or digits 

//'(?:\\d{1,3}\\.){3}': This is a non-capturing group that matches three occurrences of 1 to 3 digits followed by a period.
// The ?: at the beginning of the group makes it a non-capturing group, meaning that it doesn't capture the matched text.
// The {3} at the end of the group specifies that the group should be repeated exactly three times.
//This represents the first three parts of the IP address.

//\\d{1,3}: This matches the last part of the IP address, which can also be 1 to 3 digits.