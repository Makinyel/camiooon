package com.tallerCamiones.camion.repository;

import com.tallerCamiones.camion.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository <Driver, Long> {

}
