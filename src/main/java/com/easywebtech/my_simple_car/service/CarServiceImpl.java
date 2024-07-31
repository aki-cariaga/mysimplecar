package com.easywebtech.my_simple_car.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.easywebtech.my_simple_car.model.Car;
import com.easywebtech.my_simple_car.model.CarRequest;
import com.easywebtech.my_simple_car.model.CarResponse;

import jakarta.annotation.PostConstruct;

@Service
public class CarServiceImpl implements CarService {
	
	 @PostConstruct
	    public void init() {
	        // Initialize sample data
	        carList = new ArrayList<>();
	        carList.add(new Car(150, 1200, 180, "Red"));
	        carList.add(new Car(180, 1500, 200, "Blue"));
	        carList.add(new Car(170, 1300, 190, "Green"));
	        carList.add(new Car(160, 1100, 170, "Black"));
	        carList.add(new Car(175, 1400, 210, "Black"));
	    }
	
	private List<Car> carList; // This should be injected or fetched from a database

    // Constructor to initialize carList or use @Autowired to inject a repository

	@Override
    public List<CarResponse> searchCars(CarRequest request) {
        // Basic filtering logic based on request criteria
        return carList.stream()
            .filter(car -> matchesCriteria(car, request))
            .map(this::convertToResponse)
            .collect(Collectors.toList());
    }

 
    private boolean matchesCriteria(Car car, CarRequest request) {
        // Basic filtering logic based on request criteria and operators
        boolean matches = true;

        if (request.getLength() != null) {
            matches = applyOperator(car.getLength(), request.getLength(), request.getLengthOperator());
        }
        if (request.getWeight() != null) {
            matches = matches && applyOperator(car.getWeight(), request.getWeight(), request.getWeightOperator());
        }
        if (request.getVelocity() != null) {
            matches = matches && applyOperator(car.getVelocity(), request.getVelocity(), request.getVelocityOperator());
        }
        if (request.getColor() != null) {
            matches = matches && car.getColor().equalsIgnoreCase(request.getColor());
        }

        return matches;
    }

    private boolean applyOperator(Integer carValue, Integer requestValue, String operator) {
        if (operator == null || operator.isEmpty()) {
            return carValue.equals(requestValue);
        }

        switch (operator) {
            case "greaterThan":
                return carValue > requestValue;
            case "lessThan":
                return carValue < requestValue;
            case "greaterThanOrEqual":
                return carValue >= requestValue;
            case "lessThanOrEqual":
                return carValue <= requestValue;
            default:
                return carValue.equals(requestValue);
        }
    }

    private CarResponse convertToResponse(Car car) {
        CarResponse response = new CarResponse();
        response.setLength(car.getLength());
        response.setWeight(car.getWeight());
        response.setVelocity(car.getVelocity());
        response.setColor(car.getColor());
        return response;
    }
}
