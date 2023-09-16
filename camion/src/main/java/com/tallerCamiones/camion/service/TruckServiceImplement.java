package com.tallerCamiones.camion.service;

import com.tallerCamiones.camion.model.Truck;
import com.tallerCamiones.camion.repository.TruckRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TruckServiceImplement implements TruckService {

  private final TruckRepository truckRepository;

  @Override
  public Truck save(Truck truck) {
    return truckRepository.save(truck);
  }
}
