package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class OfertaValidacion {


    private Util util= new Util();
    public OfertaValidacion() {
    }

    public Boolean validarTitulo(String titulo) throws  Exception
    {
        if (titulo.length()>20)
        {
            throw new Exception(Mensajes.TITULO_MUY_LARGO.getMensaje());
        }
        else
        {
            return true;
        }
    }

    public Boolean validarFormatoFecha(String fechaInicio) throws Exception
    {
       String expresionRegular= "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/([0-9]{4})$";
       if (!util.buscarCoincidencia(expresionRegular, fechaInicio))
       {
           throw new Exception(Mensajes.FECHA_INCORRECTA.getMensaje());
       }
       else
       {
           return true;
       }
    }


    public Boolean validarCoherencia(LocalDate fechaInicio, LocalDate fechaFin) throws Exception
    {
        if (fechaFin.isBefore(fechaInicio))
        {
            throw new Exception(Mensajes.FECHAS_NO_COHERENTES.getMensaje());
        }
        else
        {
            return true;
        }
    }

    public Boolean validarCostoPersona(Double costoPersona) throws Exception
    {
            if (costoPersona<0)
            {
                throw new Exception(Mensajes.COSTO_NEGATIVO.getMensaje());
            }
            else
            {
                return true;
            }
    }

}
