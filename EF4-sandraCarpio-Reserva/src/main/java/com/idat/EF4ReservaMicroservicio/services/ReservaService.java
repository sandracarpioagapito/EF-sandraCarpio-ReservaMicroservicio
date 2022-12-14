package com.idat.EF4ReservaMicroservicio.services;

import java.util.List;

import com.idat.EF4ReservaMicroservicio.dto.ReservaDTO;

public interface ReservaService {
  List<ReservaDTO> listar();
  void guardar(ReservaDTO reserva);
}
