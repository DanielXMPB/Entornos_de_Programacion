/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel Perez
 */
public class TallerInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Menu = "**********************************\n"
                + "*         Menu Principal         *\n"
                + "* Equipo:XX Nombre: Daniel Perez *\n"
                + "**********************************\n"
                + "*      a. Cargar Datos           *\n"
                + "*      b. Informe Especial       *\n"
                + "*      C. Operaciones            *\n"
                + "*      d. Salir                  *\n"
                + "**********************************\n"
                + "* Introducir Opcion:             *";
        String MenuB = "**********************************\n"
                + "*      a. Agregar                *\n"
                + "*      b. Editar                 *\n"
                + "*      C. Borrar                 *\n"
                + "*      d. Salir                  *\n"
                + "**********************************\n"
                + "* Introducir Opcion:             *";
        String entrada = "";
        boolean detener = false;
        ListaChicos lista = new ListaChicos();

        while (detener == false) {

            System.out.println(Menu);
            Scanner lectura = new Scanner(System.in);
            entrada = lectura.nextLine();

            switch (entrada) {
                case "a":
                    List<Chico> nuevaLista = CSV.CargarLista();
                    lista.setChicos(nuevaLista);
                    lista.imprimir(lista.getChicos());
                    break;
                case "b":
                    if (lista.getChicos() == null) {
                    } else {
                        System.out.println("****************************"
                                + "*       Lista Total        *"
                                + "****************************");
                        lista.imprimir(lista.getChicos());
                        System.out.println("****************************"
                                + "*     Lista por Ciudad     *"
                                + "****************************");
                        lista.ListarCiudad(lista.getChicos());
                        System.out.println("****************************"
                                + "*     Lista por Grupos     *"
                                + "****************************");
                        lista.ListarEdad(lista.getChicos());
                    }
                    break;
                case "c":
                    String entradaB = "";
                    boolean detenerB = false;
                    while (detenerB == false) {
                        System.out.println(MenuB);
                        Scanner lecturaB = new Scanner(System.in);
                        entradaB = lecturaB.nextLine();

                        switch (entradaB) {
                            case "a":
                                if (lista.getChicos() == null) {
                                    System.out.println("No se han cargado datos");
                                } else {
                                    lista.AgregarElemento(lista);
                                }
                                ;
                                break;
                            case "b":
                                if (lista.getChicos() == null) {
                                    System.out.println("No se han cargado datos");
                                } else {
                                    lista.EditarElemento(lista);
                                }
                                ;
                                break;
                            case "c":
                                if (lista.getChicos() == null) {
                                    System.out.println("No se han cargado datos");
                                } else {
                                    lista.EliminarElemento(lista);
                                }
                                ;
                                break;
                            case "d":
                                detenerB = true;
                                break;
                            default:
                                System.out.println("Opcion no encontrada");
                        }
                    }
                    break;
                case "d":
                    CSV.GuardarCSV(lista);
                    detener = true;
                    break;
                default:
                    System.out.println("Opcion no encontrada");
            }
        }
    }
}
