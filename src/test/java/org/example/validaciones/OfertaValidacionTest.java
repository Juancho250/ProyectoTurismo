package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    private OfertaValidacion ofertaValidacion;

    @BeforeEach
    public void setUp()
    {
        this.ofertaValidacion= new OfertaValidacion();
    }

    @Test
    public void validarTituloCorrecto()
    {
        String tituloValido= "Inversiones Capital";
        Assertions.assertDoesNotThrow(()->ofertaValidacion.validarTitulo(tituloValido));
    }

    @Test
    public void validarTituloIncorrecto()
    {
        String tituloIncorrecto= "Inversiones CapitalGuard";
        Exception exception=Assertions.assertThrows(Exception.class, ()->ofertaValidacion.validarTitulo(tituloIncorrecto));
        Assertions.assertEquals(Mensajes.TITULO_MUY_LARGO.getMensaje(), exception.getMessage());
    }

    @Test
    public void validarFormatoFechaCorrecto()
    {
        String formatoFechaCorrecto= "14/08/2023";
        Assertions.assertDoesNotThrow(()->ofertaValidacion.validarFormatoFecha(formatoFechaCorrecto));
    }
    @Test
    public void validarFormatoFechaIncorrecto()
    {
        String formatoFechaIncorrecto= "2023/19/14";
        Exception exception=Assertions.assertThrows(Exception.class, ()->ofertaValidacion.validarFormatoFecha(formatoFechaIncorrecto));
        Assertions.assertEquals(Mensajes.FECHA_INCORRECTA.getMensaje(), exception.getMessage());
    }

    @Test
    public void validarCoherenciaDeFechasCoreectas()
    {
        LocalDate fechaInicioCorrecta=LocalDate.of(2023,6,14);
        LocalDate fechasFinCorrecta=LocalDate.of(2023,7,12);
        Assertions.assertDoesNotThrow(()->ofertaValidacion.validarCoherencia(fechaInicioCorrecta, fechasFinCorrecta));
    }

    @Test
    public void validarCoherenciaDeFechasIncorrectas()
    {
        LocalDate fechaInicioIncorrecta=LocalDate.of(2023,8,14);
        LocalDate fechasFinIncorrecta=LocalDate.of(2023,7,12);
        Exception exception=Assertions.assertThrows(Exception.class, ()->ofertaValidacion.validarCoherencia(fechaInicioIncorrecta, fechasFinIncorrecta));
        Assertions.assertEquals(Mensajes.FECHAS_NO_COHERENTES.getMensaje(), exception.getMessage());
    }

    @Test
    public void validarCostoPorPersona()
    {
        Double costoPorPersonaCorrecto= 12000.0;
        Assertions.assertDoesNotThrow(()->ofertaValidacion.validarCostoPersona(costoPorPersonaCorrecto));
    }
    @Test
    public void validarCostoPersonaIncorrecto()
    {
        Double costoPorPersonaIncorrecto= -12000.0;
        Exception exception=Assertions.assertThrows(Exception.class, ()->ofertaValidacion.validarCostoPersona(costoPorPersonaIncorrecto));
        Assertions.assertEquals(Mensajes.COSTO_NEGATIVO.getMensaje(), exception.getMessage());
    }
}