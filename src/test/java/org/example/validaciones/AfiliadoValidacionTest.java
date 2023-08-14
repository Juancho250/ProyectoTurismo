package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionTest {

    private AfiliadoValidacion afiliadoValidacion;

    @BeforeEach
    public void setUp()
    {
        this.afiliadoValidacion= new AfiliadoValidacion();
    }

    @Test
    public void validarMebresiaCorrecto()
    {
        Integer costoMembresiaValido= 30000;
        Assertions.assertDoesNotThrow(()-> afiliadoValidacion.validarMembresia(costoMembresiaValido));
    }
    @Test
    public void validarMebresiaIncorrecto()
    {
        Integer costoMembresiaInvalido= 170000;
        Exception exception=Assertions.assertThrows(Exception.class, ()->afiliadoValidacion.validarMembresia(costoMembresiaInvalido));
        Assertions.assertEquals(Mensajes.VALOR_MEMBRESIA.getMensaje(), exception.getMessage());
    }

    @Test
    public void validarCedulaCorrecta()
    {
        String cedulaValida= "12345678";
        Assertions.assertDoesNotThrow(()->afiliadoValidacion.validarCedula(cedulaValida));
    }
    @Test
    public void validarCedulaIncorrecta()
    {
        String cedulaInvalida= "1j2734jk5";
        Exception exception=Assertions.assertThrows(Exception.class, ()->afiliadoValidacion.validarCedula(cedulaInvalida));
        Assertions.assertEquals(Mensajes.NUMERO_DE_CEDULA.getMensaje(), exception.getMessage());
    }

}