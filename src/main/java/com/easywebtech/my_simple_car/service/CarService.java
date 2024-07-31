package com.easywebtech.my_simple_car.service;

import java.util.List;

import com.easywebtech.my_simple_car.model.CarRequest;
import com.easywebtech.my_simple_car.model.CarResponse;

public interface CarService {
	List<CarResponse> searchCars(CarRequest request);
}
