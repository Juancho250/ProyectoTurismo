package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {

    private LocalValidacion localValidacion;

    @BeforeEach
    public void setUp()
    {
        this.localValidacion=new LocalValidacion();
    }
    @Test
    public void validarNitCorrecto()
    {
        String nitCorrecto= "1234567890";
        Assertions.assertDoesNotThrow(()->localValidacion.validarNit(nitCorrecto));
    }
    @Test
    public void validarNitIncorrecto()
    {
        String nitIncorrecto= "123456789012";
        Exception exception=Assertions.assertThrows(Exception.class, ()->localValidacion.validarNit(nitIncorrecto));
        Assertions.assertEquals(Mensajes.NIT_INVALIDO.getMensaje(), exception.getMessage());
    }
    @Test
    public void validarNombreCorrecto()
    {
        String nombreValido="Festival Delicias";//Preparando
        //2 y 3 ejecutar y verificar
        Assertions.assertDoesNotThrow(()->localValidacion.validarNombre(nombreValido));
    }
    @Test
    public void validarNombreIncorrecto()
    {
        String nombreInvalido="Festival Delicias Culinarias Gourmet ";
        Exception exception=Assertions.assertThrows(Exception.class,()->localValidacion.validarNombre(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_INVALIDO.getMensaje(),exception.getMessage());
    }

}