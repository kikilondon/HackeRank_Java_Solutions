
import java.util.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);
        
        int dayOfWeek= calendar.get(Calendar.DAY_OF_WEEK);
       String [] daysOfWeek ={"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", };
    
       return daysOfWeek[dayOfWeek];
        
        
        
      
 
    
    }

}

