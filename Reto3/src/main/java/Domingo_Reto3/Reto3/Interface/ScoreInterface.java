/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Domingo_Reto3.Reto3.Interface;

import Domingo_Reto3.Reto3.model.Score;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PERSONALCASA
 */
public interface ScoreInterface extends CrudRepository<Score, Integer> {
    
}
