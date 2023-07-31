package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class LocalValidacion {

    protected Util util= new Util();
    public LocalValidacion() {
    }

    public Boolean validarNit(String nit) throws Exception
    {
        if (nit.length()!=10)
        {
            throw new Exception(Mensajes.NIT_INVALIDO.getMensaje());
        }
        else
        {
            return true;
        }
    }

    public Boolean validarNombre(String nombre) throws Exception
    {
        if (nombre.length()>30)
        {
            throw new Exception(Mensajes.NOMBRE_INVALIDO.getMensaje());
        }
        else
        {
            return true;
        }
    }
}
