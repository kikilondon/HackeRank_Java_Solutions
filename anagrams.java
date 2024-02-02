

 class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int strA = a.length();//retrieve length of array
        int strB = b.length();
    
        if (strA != strB)
            return false;
        
           char[] arrayA =a.toLowerCase().toCharArray();// to lowercase and turn string in array
           //Arrays.sort(arrA);
            char[] arrayB = b.toLowerCase().toCharArray();
             //Arrays.sort(arrB);
             
            bubbleSort(arrayA);//call bubbleSort function
            bubbleSort(arrayB);
            
        if (compareArrays(arrayA,arrayB)){//call compareArray function / if the arrays are equals return true 
           return true;
        }
       //otherwise return false
       return false;
    }
        // compareArray function 
      public static boolean compareArrays(char[]arrayA, char[]arrayB){
       int n= arrayA.length;// retrieve the array length 
        for(int i = 0; i<n; i++){//loop and compare each index of arrayA against each index of arrayB 
           if (arrayA[i] != arrayB[i]){// if they are different return false and stop the loop casue the arrays are not anagrams
               return false;
           }
        }
        return true;//they are  anagrams
    }
    //bubblesort function to sort arrays
        public static void bubbleSort(char[] list) { 
        int n= list.length;
         boolean swapped; 
        do { 
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list[i-1] > list[i]) { // Swap elements 
                    char temp = list[i - 1];//crete a temp variable in which store the letter on that specific index just checked
                    list[i - 1] = list[i];//move the letter reside on the next index position to the previous one (list-1)
                    list[i]= temp;//and move again the new letter to the temp variable 
                    swapped = true; //set swapped to true
                }
            }
        } while (swapped); //do all the "do" process while the swapped variable is true
    }
}