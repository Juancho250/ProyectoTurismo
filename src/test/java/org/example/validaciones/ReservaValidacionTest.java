package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    private ReservaValidacion  reservaValidacion;

    @BeforeEach
    public void setUp()
    {
        this.reservaValidacion=new ReservaValidacion();
    }

    @Test
    public void validarCantidadDePersonasCorrecta()
    {
        Integer cantidadDePersonasValido = 3;
        Assertions.assertDoesNotThrow(() -> reservaValidacion.validarPersonas(cantidadDePersonasValido));
    }

    @Test
    public void validarCantidadDePersonasIncorrecta()
    {
        Integer cantidadDePersonasInvalido = 7;
        Exception exception= Assertions.assertThrows(Exception.class, () -> reservaValidacion.validarPersonas(cantidadDePersonasInvalido));
        Assertions.assertEquals(Mensajes.MAXIMO_PERSONAS.getMensaje(), exception.getMessage());
    }

    @Test
    public void validarFormatoDeFechaCorrecto()
    {
        String formatoFechaValido= "14/08/2023";
        Assertions.assertDoesNotThrow(()->reservaValidacion.validarFormatoFecha(formatoFechaValido));
    }

    @Test
    public void validarFormatoDeFechaIncorrecto()
    {
        String formatoFechaInvalido= "2023/04/19";
        Exception exception= Assertions.assertThrows(Exception.class, ()-> reservaValidacion.validarFormatoFecha(formatoFechaInvalido));
        Assertions.assertEquals(Mensajes.FECHA_INCORRECTA.getMensaje(), exception.getMessage());
    }

}