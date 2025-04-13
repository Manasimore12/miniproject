package com.carstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carstore.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
}
