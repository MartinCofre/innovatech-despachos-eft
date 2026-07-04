package com.citt.persistence.services;

import com.citt.exceptions.DespachoNotFoundException;
import com.citt.persistence.entity.Despacho;

import java.util.List;

public interface DespachoService {
    List<Despacho> findAllDespachos();
    Despacho saveDespacho(Despacho despacho);
    Despacho updateDespacho(Long idDespacho, Despacho despacho) throws DespachoNotFoundException;
    void deleteDespacho(Long idDespacho) throws DespachoNotFoundException, DespachoNotFoundException;
    Despacho findById(Long idDespacho) throws DespachoNotFoundException;
}