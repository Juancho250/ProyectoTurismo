package org.example.validaciones;

import org.example.utilidades.Util;

public class   NoAfiliadoValidacion {

    private Util util= new Util();

    public Boolean validarNumeroReservasMensuales(Integer parametroNumeroReservas) throws Exception {
        String expresionRegular = "^[+-]?//d+$";

        String paraetroString = Integer.toString(parametroNumeroReservas);
        if( !util.buscarCoincidencia(expresionRegular,paraetroString)){
            throw new Exception("Señor usuario su numero de reservas está mal, debe tener solo digitos");
        }
        else if ( parametroNumeroReservas < 0 ){
            throw new Exception("Señor usuario el numero de reservas no puede ser negativo");
        }
        else
        {
            return true;
        }
    }

}
