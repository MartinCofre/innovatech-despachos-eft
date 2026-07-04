package com.citt.persistence.services;

import com.citt.exceptions.VentaNotFoundException;
import com.citt.persistence.entity.Venta;
import com.citt.persistence.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService{

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> findAllVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta updateVenta(Long idVenta, Venta venta) throws VentaNotFoundException {
        Optional<Venta> optionalVenta = ventaRepository.findById(idVenta);

        if (optionalVenta.isPresent()) {
            Venta ventaDB = optionalVenta.get();

            if (Objects.nonNull(venta.getDireccionCompra()) && !venta.getDireccionCompra().trim().isEmpty()) {
                ventaDB.setDireccionCompra(venta.getDireccionCompra());
            }

            if (Objects.nonNull(venta.getValorCompra())) {
                ventaDB.setValorCompra(venta.getValorCompra());
            }

            if (Objects.nonNull(venta.getFechaCompra())) {
                ventaDB.setFechaCompra(venta.getFechaCompra());
            }

            if (Objects.nonNull(venta.getDespachoGenerado())) {
                ventaDB.setDespachoGenerado(venta.getDespachoGenerado());
            }

            // Guardar la venta actualizada en la BD
            return ventaRepository.save(ventaDB);
        } else {
            throw new VentaNotFoundException("!No es posible actualizar! No existe venta con ID: " + idVenta);
        }
    }

    @Override
    public void deleteVenta(Long idVenta) throws VentaNotFoundException {
        Optional<Venta> venta = ventaRepository.findById(idVenta);
        if(!venta.isPresent()) {
            throw new VentaNotFoundException("¡No es posible eliminar! No existe venta con el ID: " + idVenta);
        }else {
            ventaRepository.deleteById(idVenta);
        }
    }

    @Override
    public Venta findById(Long idVenta) throws VentaNotFoundException {
        Optional<Venta> venta = ventaRepository.findById(idVenta);
        if(!venta.isPresent()) throw new VentaNotFoundException("Venta no encontrada con el ID: " + idVenta);
        return venta.get();
    }
}
