/*
 * Click nbfs://nbhost/SystemFile/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFile/Templates/Classes/Class.java to edit this template
 */

package practica2.dao;

import practica2.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {

}