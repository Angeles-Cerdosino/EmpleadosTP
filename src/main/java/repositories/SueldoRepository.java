/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import model.Sueldo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acerdosi
 */
@Repository
public interface SueldoRepository extends JpaRepository<Sueldo,Long> {
    
    Sueldo findBySueldoNumber(int legajo);
    
}
