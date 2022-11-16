
package util;

import exceptions.InvalidFilterInformation;
import java.util.Map;

/**
 *
 * @author acerdosi
 */
public class Validator {
     public static boolean validFilters(Map<String, String> filters) {
        if (filters.size() == 0) return true;

        for (Map.Entry<String, String> entry : filters.entrySet()) {
            if(!(entry.getKey().equals("queryType") || entry.getKey().equals("empleado"))) throw new InvalidFilterInformation("You´ve entered invalid Filters");
        }

        return validFilterLogic(filters.getOrDefault("queryType",""),filters.getOrDefault("empleado",""));
    }
    
     
      public static boolean validFilterLogic(String queryType, String legajo ) {

        //if query is empty
        if (queryType.equals("")) throw new InvalidFilterInformation("You did not enter any query type");

        // if query is C type
        if (queryType.equals("C")) return true;

        //if query is  P or V --> date must not be empty
        if ((queryType.equals("P") || queryType.equals("V"))) throw new InvalidFilterInformation("You did not enter any date");

       

        //If order is not in query
        if (legajo.equals("")) return true;

        //If valid order
        if (!(legajo.equals("1") || legajo.equals("2"))) throw new InvalidFilterInformation("Invalid legajo number");

        return true;
    }

      
    public static boolean validFiltersOrders(Map<String, String> filters) {
       if (filters.size() == 0)  throw new InvalidFilterInformation("You did not enter any filter");

        for (Map.Entry<String, String> entry : filters.entrySet()) {
            if(!(entry.getKey().equals("legajo"))) throw new InvalidFilterInformation("You´ve entered invalid Filters");
        }

        return validFilterLogicOrders(filters.getOrDefault("legajo",""));
    }

    private static boolean validFilterLogicOrders(String legajo) {

        //if dealer number is empty
        if (legajo.equals("")) throw new InvalidFilterInformation("You did not enter any legajo number");

        // if dealer number is not 4 digits long
        if (!isNumeric(legajo)) throw new InvalidFilterInformation("Legajo number must have all numeric characters");

        return true;
    }


    public static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    
    
}
