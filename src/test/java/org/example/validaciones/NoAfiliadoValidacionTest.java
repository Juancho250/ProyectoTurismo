package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoAfiliadoValidacionTest {

    private NoAfiliadoValidacion noAfiliadoValidacion;

    @BeforeEach
    public void setUp()
    {
        this.noAfiliadoValidacion= new NoAfiliadoValidacion();
    }

    @Test
    public void validarNumeroPersonasCorrecto()
    {
        Integer numeroPersonasValido=3;
        Assertions.assertDoesNotThrow(()->this.noAfiliadoValidacion.ValidarnumeroPersonas(numeroPersonasValido));
    }

    @Test
    public void validarNumeroPersonasIncorrecto()
    {
        Integer numeroPersonasInvalido= 5;
        Exception exception=Assertions.assertThrows(Exception.class, ()->this.noAfiliadoValidacion.ValidarnumeroPersonas(numeroPersonasInvalido));
        Assertions.assertEquals(Mensajes.NUMERO_DE_PERSONAS_EXCEDIDO.getMensaje(), exception.getMessage());
    }

    @Test
    public void validarNumeroReservasCorrecto()
    {
        Integer  numeroReservasValido= 3;
        Assertions.assertDoesNotThrow(()->noAfiliadoValidacion.ValidarnumeroReservas(numeroReservasValido));
    }

    @Test
    public void validarNumeroReservasIncorrecto()
    {
        Integer numeroReservasInvalido= -5;
        Exception exception=Assertions.assertThrows(Exception.class, ()->this.noAfiliadoValidacion.ValidarnumeroReservas(numeroReservasInvalido));
        Assertions.assertEquals(Mensajes.NUMERO_DE_RESERVAS_NEGATIVO.getMensaje(), exception.getMessage());
    }
}