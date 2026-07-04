package com.citt.controller;

import com.citt.exceptions.VentaNotFoundException;
import com.citt.persistence.entity.Venta;
import com.citt.persistence.services.VentaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/ventas")
@Tag(name = "Venta", description = "Controlador para gestionar ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @Operation(summary = "Crear una nueva venta", description = "Crea una nueva venta en el sistema")
    @PostMapping
    public ResponseEntity<Venta> crearVenta(@Valid @RequestBody Venta venta){
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{idVenta}")
                .buildAndExpand(venta.getIdVenta())
                .toUri();
        ventaService.saveVenta(venta);
        return ResponseEntity.created(location).body(venta);
    }

    @PutMapping("/{idVenta}")
    @Operation(summary = "Actualizar una venta existente", description = "Actualiza los detalles de una venta existente")
    public ResponseEntity<Venta> actualizarVenta(@Valid @PathVariable Long idVenta, @RequestBody Venta venta) throws VentaNotFoundException {
        Venta ventaActualizada = ventaService.updateVenta(idVenta, venta);
        return ResponseEntity.ok(ventaActualizada);
    }

    @GetMapping
    @Operation(summary = "Obtener todas las ventas", description = "Devuelve una lista de todas las ventas")
    public ResponseEntity<List<Venta>> getVentas(){
        return ResponseEntity.ok(ventaService.findAllVentas());
    }

    @GetMapping("/{idVenta}")
    @Operation(summary = "Obtener una venta por ID", description = "Devuelve los detalles de una venta específica")
    public ResponseEntity<Venta> obtenerVenta(@PathVariable Long idVenta) throws VentaNotFoundException {
        Venta venta = ventaService.findById(idVenta);
        return ResponseEntity.ok(venta); // Retornamos la venta encontrada con un estado 200 (OK)
    }

    @DeleteMapping("/{idVenta}")
    @Operation(summary = "Eliminar una venta", description = "Elimina una venta del sistema")
    public ResponseEntity<Void> eliminarVenta(@PathVariable Long idVenta) throws VentaNotFoundException {
        ventaService.deleteVenta(idVenta);
        return ResponseEntity.noContent().build(); // Respuesta 204 No Content si se elimina correctamente
    }
}


