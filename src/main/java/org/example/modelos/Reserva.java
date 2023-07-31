package org.example.modelos;

import com.sun.source.tree.TryTree;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva
{

    //ATRIBUTOS=VARIABLES=DATOS

    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    public Integer personasPorReserva;

    public Double IVA=0.19;
    private ReservaValidacion validacion= new ReservaValidacion();

    //Crear variable


    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva, Integer personasPorReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.personasPorReserva = personasPorReserva;
    }

    public Reserva() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva)
    {
        try
        {
            this.validacion.validarFormatoFecha(fechaReserva);
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha= LocalDate.parse(fechaReserva, formatter);
            this.fechaReserva= fecha;

        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Integer getPersonasPorReserva() {
        return personasPorReserva;
    }

    public void setPersonasPorReserva(Integer personasPorReserva)
    {
        try
        {
            this.validacion.validarPersonas(personasPorReserva);
            this.personasPorReserva=personasPorReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }
}
