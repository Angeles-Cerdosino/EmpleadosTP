package EmpleadosTP.LCIV.util;

import EmpleadosTP.LCIV.exceptions.InvalidFilterInformation;
import javax.persistence.*;

import java.util.Map;

public class Validator {

    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    public static EntityManagerFactory buildEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("empleadoTP");
    }

    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager(); //por cada hilo o request o por cada cliente. va a usar la misma instancia, el mismo objeto, es una instancia un singleton.
    }

    public static boolean validFilters(Map<String, String> filters) {
        if (filters.size() == 0) return true;

        for (Map.Entry<String, String> entry : filters.entrySet()) {
            if(!(entry.getKey().equals("queryType") || entry.getKey().equals("legajo"))) throw new InvalidFilterInformation("You´ve entered invalid Filters");
        }

        return validFilterLogic(filters.getOrDefault("queryType",""),filters.getOrDefault("legajo",""));
    }

    public static boolean validFilterLogic(String queryType, String legajo ) {

        //if query is empty
        if (queryType.equals("")) throw new InvalidFilterInformation("You did not enter any query type");

        // if query is C type
        if (queryType.equals("C")) return true;

        //if query is  P or V --> date must not be empty
        if ((queryType.equals("P") || queryType.equals("V"))) throw new InvalidFilterInformation("You did not enter any date");


        //If legajo is not in query
        if (legajo.equals("")) return true;

        //If valid legajo
        if (!(legajo.equals("1") || legajo.equals("2"))) throw new InvalidFilterInformation("Invalid legajo number");

        return true;
    }


}
