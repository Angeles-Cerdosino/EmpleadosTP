/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import exceptions.NotFoundException;
import java.util.*;
import model.Empleado;
import repositories.*;

/**
 *
 * @author acerdosi
 */
public class OrderSorterUtils {
    public static List<Empleado> getSortedList(Map<String, String> params, EmpleadoRepository repository)  {
        List<Empleado> sorterList = new ArrayList<Empleado>();
        String legajo = params.get("legajo");

        throw new NotFoundException("404 Not Found");
    }
    
}
