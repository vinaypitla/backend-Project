package com.showroom.car.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.showroom.car.Entity.CarEntity;

public interface CarRepo extends JpaRepository<CarEntity, String>  {

	

}
