package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class AfiliadoValidacion
{
    public AfiliadoValidacion() {
    }

    private Util util=new Util();

    public Boolean validarMembresia(Integer membresia) throws Exception
    {
        if (membresia > 20000 && membresia < 150000)
        {
            return true;
        }
        else
        {
            throw new Exception(Mensajes.VALOR_MEMBRESIA.getMensaje());
        }
    }
    public Boolean validarCedula(String cedula) throws Exception
    {
        String expresionRegular = "^[0-9]{10}$";

        if (!util.buscarCoincidencia(expresionRegular,cedula))
        {
            throw new Exception(Mensajes.NUMERO_DE_CEDULA.getMensaje());
        }
        else
        {
            return true;
        }
    }
}
