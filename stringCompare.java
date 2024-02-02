

 class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //initialise the min and max of the current string;
        
        
        //iterate on each substring 
        for ( int i= 1; i<= s.length() - k; i++){
            String currentSub = s.substring(i, i+k);
            
            //  System.out.println("Current substring: " + currentSub);
            // System.out.println("Smallest: " + smallest);
            // System.out.println("Largest: " + largest);
            if (largest.compareTo(currentSub) < 0){
               largest = currentSub;
            }if(smallest.compareTo(currentSub) > 0){
                
               smallest= currentSub;
            }
            // //System.out.println(smallest);
             ///System.out.println(largest);
        }
        
        
       
        return smallest + "\n" + largest;
    }


 }