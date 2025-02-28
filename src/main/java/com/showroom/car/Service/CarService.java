package com.showroom.car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showroom.car.Entity.CarEntity;
import com.showroom.car.Repo.CarRepo;


@Service
public class CarService {
	@Autowired
	CarRepo carRepo;
	
	public String saveNewCar(CarEntity carEntity) {
		String res = "";
		try {
			carRepo.save(carEntity);

			res = "successfully added new car.." + carEntity.getModel() + " into DB";

		} catch (Exception e) {
			res = "not able to insert new Car..." + carEntity.getModel();
		}
		return res;
	}
public List<CarEntity> fetchAllCars() {
		
		return carRepo.findAll();
	}
}
