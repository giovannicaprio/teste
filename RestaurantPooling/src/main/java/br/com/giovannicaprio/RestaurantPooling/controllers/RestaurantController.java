package br.com.giovannicaprio.RestaurantPooling.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.giovannicaprio.RestaurantPooling.models.Restaurant;
import br.com.giovannicaprio.RestaurantPooling.repository.RestaurantRepository;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	
	@Autowired 
	private RestaurantRepository restaurantRepository;

	@GetMapping("/all")
	public List<Restaurant> getAll()
	{
		return restaurantRepository.findAll();
	}
	
	


}

   
