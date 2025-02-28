package com.showroom.car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.showroom.car.Entity.CarEntity;
import com.showroom.car.Service.CarService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin("*")

public class CarController {
	@Autowired
	CarService carService;
	
	@PostMapping("showroom/car/user")
	public String postMethodName(@RequestBody CarEntity carentity) {
		//TODO: process POST request
		System.out.println("from react---->"+carentity);
		return carService.saveNewCar(carentity);
	}
	@GetMapping
	public List<CarEntity>  getAllCars(){
		
		return carService.fetchAllCars();
		
	}
	}
	
	
	
	





	

	
	
	
	
	
	

