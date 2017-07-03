package br.com.giovannicaprio.RestaurantPooling.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.giovannicaprio.RestaurantPooling.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
    User findByName(String name);
    User findByNameAndPassword(String name, String password);
}
