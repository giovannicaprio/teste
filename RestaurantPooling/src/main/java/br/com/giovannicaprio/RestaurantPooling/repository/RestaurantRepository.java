package br.com.giovannicaprio.RestaurantPooling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.giovannicaprio.RestaurantPooling.models.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
	
}
