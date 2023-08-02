package org.example.modelos;

import org.example.utilidades.MetodosPago;

public class Afiliado extends Usuario
{
    private Integer valorMembresia;
    private MetodosPago metodoPago;
    private String documentoReferido;
    private final Double IVA= 0.19;

    public Afiliado() {
    }

    public Afiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Integer valorMembresia, MetodosPago metodoPago, String documentoReferido) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.valorMembresia = valorMembresia;
        this.metodoPago = metodoPago;
        this.documentoReferido = documentoReferido;
    }

    @Override
    public Double calcularAnualidad() {
        //costoAnual y restar el 20% valor de la mensualidad
        return this.getCostoAnual()-(this.getValorMembresia()*0.2);
    }


    public Integer getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    public MetodosPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodosPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        this.documentoReferido = documentoReferido;
    }

    public Double aplicarIVAMembresia()
    {
        return  this.valorMembresia+this.IVA+this.valorMembresia;
    }
}
