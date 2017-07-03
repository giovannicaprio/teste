package br.com.giovannicaprio.RestaurantPooling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.giovannicaprio.RestaurantPooling.models.Uservotes;

public interface UserVotesRepository extends JpaRepository<Uservotes, Integer> {
	
    //User findByName(String name);
    //User findByNameAndPassword(String name, String password);
}