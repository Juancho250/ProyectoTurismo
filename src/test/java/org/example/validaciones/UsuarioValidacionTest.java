package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest
{
    //1.preparando
    //Probando el objeto UsuarioValidacion

    private UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void configuracionInicial()
    {
        this.usuarioValidacion=new UsuarioValidacion();

    }

    @Test
    public void validarNombreUsuarioCorrecto()
    {
        String nombreValido="Juan Esteban Muñoz";//Preparando
        //2 y 3 ejecutar y verificar
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarNombre(nombreValido));
    }


    @Test
    public void validarNombreUsuarioIncorrecto()
    {
        String nombreInvalido="123451";
        Exception exception=Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombre(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarCorreoCorrecto()
    {
        String correoValido="Juaz2560@gmail.com";
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarCorreo(correoValido));
    }

    @Test
    public void validarCorreoIncorrecto()
    {
        String correoInvalido="juaz2560gmail.com";
        Exception exception= Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarCorreo(correoInvalido));
        Assertions.assertEquals(Mensajes.CORREO_INVALIDO.getMensaje(), exception.getMessage());
    }
}