package org.example.modelos;

import org.example.validaciones.OfertaValidacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Oferta
{

    //ATRIBUTOS=VARIABLES=DATOS

    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Integer idlocal;
    private OfertaValidacion validacion= new OfertaValidacion();


    public Oferta() {

    }
    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idlocal = idlocal;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        try
        {
            this.validacion.validarTitulo(titulo);
            this.titulo=titulo;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio)
    {
        try
        {
            //Como convertir un string en localdate
            this.validacion.validarFormatoFecha(fechaInicio);
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha= LocalDate.parse(fechaInicio, formatter);
            this.fechaInicio=fecha;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin)
    {
        try
        {
            this.validacion.validarFormatoFecha(fechaFin); //validar que el formato de la fecha ingrsa sea dd/mm/yyyy
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha= LocalDate.parse(fechaFin, formatter);
            this.validacion.validarCoherencia(this.fechaInicio,fecha);
            this.fechaFin=fecha;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona)
    {
        try
        {
            this.validacion.validarCostoPersona(costoPersona);
            this.costoPersona=costoPersona;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Integer getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(Integer idlocal) {
        this.idlocal = idlocal;
    }


}
