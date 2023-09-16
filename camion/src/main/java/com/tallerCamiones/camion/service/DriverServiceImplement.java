package com.tallerCamiones.camion.service;

import com.tallerCamiones.camion.model.Driver;
import com.tallerCamiones.camion.repository.DriverRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DriverServiceImplement implements DriverService{
  private final DriverRepository driverRepository;
  @Override
  public Driver save(Driver driver) {
    return driverRepository.save(driver);
  }
}
