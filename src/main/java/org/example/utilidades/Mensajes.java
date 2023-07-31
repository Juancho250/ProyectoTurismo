package org.example.utilidades;

public enum Mensajes
{

    NOMBRE_SOLO_LETRAS("Señor usuario su nombre solo puede tener letras"),
    NOMBRE_MUY_CORTO("Señor usuario revise la cantida de caracteres que es muy pequeña"),
    CORREO_INVALIDO("Señor usuario el correo ingresado no es valido"),
    ZONA_INVALIDA("La zona ingresada no es valida"),
    NIT_INVALIDO("Señor ususario el debe tener 10 digitos"),
    NOMBRE_INVALIDO("El nombre no puede exceder los 30 caracteres"),
    TITULO_MUY_LARGO("El titulo no puede exceder los 20 caracteres"),
    FECHA_INCORRECTA("Señor ususario la fecha debe ser en formato (DD/MM/YYYY)"),
    COSTO_NEGATIVO("El costo por persona no puede ser negativo"),
    MAXIMO_PERSONAS("El número de personas por reserva no puede ser mayor a 4"),
    FECHAS_NO_COHERENTES("La fecha de fin debe ser mayor a la de inicio");

    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }


}
