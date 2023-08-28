package org.example.modelos;

import org.example.interfaces.Deduccion;
import org.example.interfaces.Reporte;

public class EntidadCultural extends Local implements Deduccion, Reporte {
    @Override
    public double calcularDeduccionAnualidad() {

        return 0;
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
