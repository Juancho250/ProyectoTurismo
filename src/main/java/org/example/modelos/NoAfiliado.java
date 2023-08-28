package org.example.modelos;

import org.example.interfaces.Deduccion;
import org.example.interfaces.Reporte;

public class NoAfiliado extends Usuario implements Deduccion, Reporte
{
    private Integer numeroReservasMensuales;


    @Override
    public Double calcularAnualidad() {
        return null;
    }

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
