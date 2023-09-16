package com.tallerCamiones.camion.controller;

import com.tallerCamiones.camion.model.Driver;
import com.tallerCamiones.camion.service.DriverService;
import javax.sound.midi.Track;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/driver")
@AllArgsConstructor
public class DriverController {
  private final DriverService driverService;

  @PostMapping
  public ResponseEntity <Driver> save (@RequestBody Driver driver){
    return ResponseEntity.ok(driverService.save(driver));
  }



}
