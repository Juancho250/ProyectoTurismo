package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util
{
    public  Boolean buscarCoincidencia(String expresionRegular, String cadena)
    {
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(cadena);
        if (coincidencia.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
