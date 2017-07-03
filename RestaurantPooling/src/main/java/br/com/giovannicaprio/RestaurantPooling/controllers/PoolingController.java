package br.com.giovannicaprio.RestaurantPooling.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.giovannicaprio.RestaurantPooling.models.Pooling;
import br.com.giovannicaprio.RestaurantPooling.repository.PoolingRepository;

@RestController
@RequestMapping("/pooling")
public class PoolingController {
	
	@Autowired 
	private PoolingRepository poolingRepository;

	@GetMapping("/all")
	public List<Pooling> getAll()
	{
		return poolingRepository.findAll();
	}

}
