package com.tallerCamiones.camion.repository;

import com.tallerCamiones.camion.model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository <Truck,Long > {

}
