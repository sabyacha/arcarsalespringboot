package com.Banking.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.Banking.modal.Car;
import com.Banking.modal.User;
import com.Banking.repository.CarRepository;
import com.Banking.repository.UserRepository;

@Service
@Transactional
public class CarService {
	
	
private final CarRepository carRepository;
	
	public  CarService(CarRepository carRepository) {
		this.carRepository=carRepository;
	}
	
	public void saveMyCarImage(Car car ) {
		carRepository.save(car);
	}
	
	
	public Optional<Car> getImage(int id) { 
		return carRepository.findById(id);//userRepository.findOne(id); 
	}
	
	
	
	}

	
