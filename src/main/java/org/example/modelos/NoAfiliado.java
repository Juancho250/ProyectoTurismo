package org.example.modelos;

import org.example.interfaces.Deduccion;
import org.example.interfaces.Reporte;

public class NoAfiliado extends Usuario implements Deduccion, Reporte
{



    @Override
    public Double calcularAnualidad() {
        return null;
    }

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
