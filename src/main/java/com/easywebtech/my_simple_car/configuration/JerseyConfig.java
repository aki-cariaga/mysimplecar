package com.easywebtech.my_simple_car.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.easywebtech.my_simple_car.controller.CarController;

@Component
public class JerseyConfig extends ResourceConfig 
{
  public JerseyConfig() 
  {
    register(CarController.class);
  }
}
