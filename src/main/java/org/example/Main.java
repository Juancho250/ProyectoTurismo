package org.example;

import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Reserva;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Integer seleccion;
        Scanner teclado = new Scanner(System.in);
        Usuario usuario= new Usuario();
        Oferta oferta= new Oferta();
        Local local = new Local();
        Reserva reserva= new Reserva();

        System.out.println("______________ Menu ______________");
        System.out.println("1. Usuario");
        System.out.println("2. Local");
        System.out.println("3. Oferta");
        System.out.println("4. Reserva");
        System.out.print("                    Seleccione una opcion: ");
        seleccion=teclado.nextInt();
        teclado.nextLine();


        switch (seleccion) {
            case 1:
                System.out.println("########### Recogiendo datos del ususario ##########");
                System.out.print("Ingresa tus nombres y apellidos: ");
                usuario.setNombres(teclado.nextLine());
                System.out.print("Ingrese el documento de " + usuario.getNombres() + " : ");
                usuario.setDocumento(teclado.nextLine());
                System.out.print("Digita tu correo electronico: ");
                usuario.setCorreoElectronico(teclado.nextLine());
                System.out.print("Digite el numero de la zona (1/2/3/4): ");
                usuario.setUbicacion(teclado.nextInt());
                System.out.println("-----------------------------");
                break;

            case 2:
                System.out.println("############ Recogiendo datos del local ###########");
                System.out.print("Digite el nombre de su local: ");
                local.setNombre(teclado.nextLine());
                System.out.print("Digite el nit del local " + local.getNombre() + " : ");
                local.setNit(teclado.nextLine());
                System.out.println("-----------------------------");break;

            case 3:
                System.out.println("########### Recogiendo datos de la oferta ###########");
                System.out.print("Ingrese el titulo de la oferta: ");
                oferta.setTitulo(teclado.nextLine());
                System.out.print("Descripcion de "+oferta.getTitulo()+" : ");
                oferta.setDescripcion(teclado.nextLine());
                System.out.print("Ingrese la fecha de inicio:  ");
                oferta.setFechaInicio(teclado.nextLine());
                System.out.print("Ingrese la fecha de fin: ");
                oferta.setFechaFin(teclado.nextLine());
                System.out.print("Costo por persona: ");
                oferta.setCostoPersona(teclado.nextDouble());
                System.out.println("-----------------------------");break;

            case 4:
                System.out.println("########### Recogiendo datos de la reserva ###########");
                System.out.print("Fecha de la reserva: ");
                reserva.setFechaReserva(teclado.nextLine());
                System.out.print("Cantidad de personas para la reserva: ");
                reserva.setPersonasPorReserva(teclado.nextInt());
                System.out.println("-----------------------------");break;


        }

    }
}