package org.example.modelos;

import org.example.interfaces.Deduccion;
import org.example.interfaces.Reporte;

public class AgrupacionCultural extends Local implements Deduccion, Reporte {
    @Override
    public void calcularDeduccionAnualidad() {

    }

    @Override
    public Double calcularDescuentoMensualidad() {
        return null;
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void modificarReporte(Integer id) {

    }
}
