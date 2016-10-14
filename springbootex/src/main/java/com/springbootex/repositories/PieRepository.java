/**
 * 
 */
package com.springbootex.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springbootex.model.Pie;

/**
 * @author su828791
 *
 */
public interface PieRepository extends CrudRepository<Pie, Long> {  
    List<Pie> findByName(String name);
}