package com.tallerCamiones.camion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Truck {
  @Id
  private Long id;
  private String placa;

  private String modelo;


}
