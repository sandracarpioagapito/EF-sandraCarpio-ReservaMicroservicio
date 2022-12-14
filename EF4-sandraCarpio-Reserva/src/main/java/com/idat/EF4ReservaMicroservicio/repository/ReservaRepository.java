package com.idat.EF4ReservaMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EF4ReservaMicroservicio.models.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
  
}
