package com.easywebtech.my_simple_car.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import com.easywebtech.my_simple_car.model.CarRequest;
import com.easywebtech.my_simple_car.model.CarResponse;
import com.easywebtech.my_simple_car.service.CarService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/cars")
public class CarController {
	
	@Autowired
    private CarService carService;

	@POST
    @Path("/search")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response searchCars(CarRequest request) {
		List<CarResponse> cars = carService.searchCars(request);
        return Response.ok(cars).build();
    }

}
