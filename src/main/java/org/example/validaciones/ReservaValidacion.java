package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class ReservaValidacion {

    private Util util= new Util();

    public ReservaValidacion() {
    }

    public Boolean validarPersonas(Integer personasPorReserva) throws Exception
    {
        if (personasPorReserva>4)
        {
            throw new Exception(Mensajes.MAXIMO_PERSONAS.getMensaje());
        }
        else
        {
            return true;
        }
    }

    public Boolean validarFormatoFecha(String fechaReserva) throws Exception
    {
        String expresionRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/([0-9]{4})$";
        if (!util.buscarCoincidencia(expresionRegular, fechaReserva))
        {
            throw new Exception(Mensajes.FECHA_INCORRECTA.getMensaje());
        } else
        {
            return true;
        }
    }
}
