package com.citt.persistence.services;

import com.citt.exceptions.VentaNotFoundException;
import com.citt.persistence.entity.Venta;

import java.util.List;

public interface VentaService {
    List<Venta> findAllVentas();
    Venta saveVenta(Venta venta);
    Venta updateVenta(Long idVenta, Venta venta) throws VentaNotFoundException;
    void deleteVenta(Long idVenta) throws VentaNotFoundException;
    Venta findById(Long idVenta) throws VentaNotFoundException;
}
