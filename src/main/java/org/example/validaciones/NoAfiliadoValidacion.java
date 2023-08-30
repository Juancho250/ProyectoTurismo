package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class   NoAfiliadoValidacion {

    private Util util= new Util();

    public Boolean ValidarnumeroReservas (Integer numeroreservas) throws Exception
    {
        if (numeroreservas < 0)
        {
            throw new Exception(Mensajes.NUMERO_DE_RESERVAS_NEGATIVO.getMensaje());
        }

        else
        {
            return true;
        }

    }

    public Boolean ValidarnumeroPersonas (Integer numeropersonas)  throws Exception
    {
        if (numeropersonas > 4)
        {
            throw new Exception(Mensajes.NUMERO_DE_PERSONAS_EXCEDIDO.getMensaje());
        }

        else
        {
            return true;
        }
    }

}
