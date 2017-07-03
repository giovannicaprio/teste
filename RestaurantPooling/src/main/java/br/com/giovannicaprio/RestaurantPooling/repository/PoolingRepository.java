package br.com.giovannicaprio.RestaurantPooling.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.giovannicaprio.RestaurantPooling.models.Pooling;

public interface PoolingRepository extends JpaRepository<Pooling, Integer> {
	
    //User findByName(String name);
    //User findByNameAndPassword(String name, String password);
	
}