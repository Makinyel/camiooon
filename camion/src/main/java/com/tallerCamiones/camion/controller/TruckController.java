package com.tallerCamiones.camion.controller;

import com.tallerCamiones.camion.model.Truck;
import com.tallerCamiones.camion.service.TruckService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/truck")
@AllArgsConstructor
public class TruckController {

  private final TruckService truckService;

  @PostMapping
  public ResponseEntity <Truck> save(@RequestBody Truck truck) {
    return ResponseEntity.ok(truckService.save(truck));
  }
}
