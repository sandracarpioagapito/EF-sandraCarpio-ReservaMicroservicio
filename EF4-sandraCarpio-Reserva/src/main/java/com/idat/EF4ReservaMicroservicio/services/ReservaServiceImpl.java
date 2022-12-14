package com.idat.EF4ReservaMicroservicio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EF4ReservaMicroservicio.dto.ReservaDTO;
import com.idat.EF4ReservaMicroservicio.models.Reserva;
import com.idat.EF4ReservaMicroservicio.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

  @Autowired
  private ReservaRepository repository;
  
  @Override
  public List<ReservaDTO> listar() {
    List<ReservaDTO> lista = new ArrayList<>();
    ReservaDTO dto = null;

    for (Reserva reserva : repository.findAll()) {
      dto = new ReservaDTO();
      dto.setCodigo(reserva.getIdReserva());
      dto.setCosto(reserva.getCosto());
      lista.add(dto);
    }

    return lista;
  }

  @Override
  public void guardar(ReservaDTO reserva) {
    Reserva obj = new Reserva();
    obj.setIdReserva(obj.getIdReserva());
    obj.setCosto(obj.getCosto());
    repository.save(obj);
  }
  
}
