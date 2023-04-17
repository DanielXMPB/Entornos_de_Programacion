/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel Perez
 */
public class ListaChicos {

    public List<Chico> chicos;

    public ListaChicos() {
    }

    public ListaChicos(List<Chico> chicos) {
        this.chicos = chicos;
    }

    public List<Chico> getChicos() {
        return chicos;
    }

    public void setChicos(List<Chico> chicos) {
        this.chicos = chicos;
    }

    public void imprimir(List<Chico> chicos) {
        chicos.forEach(System.out::println);
    }

    public void ListarCiudad(List<Chico> chicos) {
        String[] ciudades = {"Bucaramanga", "Giron", "Florida", "Piedecuesta"};
        int total = ciudades.length;
        float totalchicos = chicos.size();
        for (int i = 0; i < total; i++) {
            int contador = 0;
            for (int j = 0; j < totalchicos; j++) {
                if (chicos.get(j).getCiudad().equals(ciudades[i])) {
                    contador = contador + 1;
                }
            }
            float porcentaje = (contador / totalchicos) * 100;
            System.out.println("Ciudad: " + ciudades[i] + ", Cantidad: " + contador + ", Porcentaje: " + porcentaje);
        }
    }

    public void ListarEdad(List<Chico> chicos) {
        int[] totales = {0, 0, 0};
        for (int i = 0; i < chicos.size(); i++) {
            if (chicos.get(i).getEdad() <= 5) {
                totales[0] = totales[0] + 1;
            } else if (chicos.get(i).getEdad() > 5 && chicos.get(i).getEdad() <= 10) {
                totales[1] = totales[1] + 1;
            } else if (chicos.get(i).getEdad() > 10) {
                totales[2] = totales[2] + 1;
            }
        }
        for (int i = 0; i < totales.length; i++) {
            System.out.println("Grupo " + (i + 1) + ", Total: " + totales[i]);
        }
    }

    public void AgregarElemento(ListaChicos lista) {
        boolean sexoCorrecto = false;
        boolean ciudadCorrecta = false;
        int codigo;
        String sexo;
        String nombre;
        int edad;
        String ciudad;
        Chico chico = new Chico();
        System.out.println("Ingrese el codigo del elemento: ");
        Scanner dato0 = new Scanner(System.in);
        codigo = Integer.parseInt(dato0.nextLine());
        chico.setCodigo(codigo);
        while (sexoCorrecto == false) {
            System.out.println("Ingrese el sexo del elemento(Masculino o Femenino): ");
            Scanner dato1 = new Scanner(System.in);
            sexo = dato1.nextLine();
            if (sexo.equals("Masculino") || sexo.equals("Femenino")) {
                chico.setSexo(sexo);
                sexoCorrecto = true;
            } else {
                System.out.println("vuelva a ingresar correctamente el sexo del elemento(Masculino o Femenino): ");
            }
        }
        System.out.println("Ingrese el nombre del elemento: ");
        Scanner dato2 = new Scanner(System.in);
        nombre = dato2.nextLine();
        chico.setNombre(nombre);
        System.out.println("Ingrese la edad del elemento: ");
        Scanner dato3 = new Scanner(System.in);
        edad = Integer.parseInt(dato3.nextLine());
        chico.setEdad(edad);
        while (ciudadCorrecta == false) {
            System.out.println("1-Bucaramanga\n"
                    + "2-Giron\n"
                    + "3-Florida\n"
                    + "4-Piedecuesta");
            System.out.println("Ingrese la ciudad: ");
            Scanner dato4 = new Scanner(System.in);
            ciudad = dato4.nextLine();
            if (ciudad.equals("Bucaramanga") || ciudad.equals("Giron")
                    || ciudad.equals("Florida") || ciudad.equals("Piedecuesta")) {
                chico.setCiudad(ciudad);
                ciudadCorrecta = true;
            } else {
                System.out.println("La ciudad no se encuetra disponible");
            }
        }
        try {
            lista.chicos.add(chico);
            System.out.println("El elemento se ha agregado correctamente");
        } catch (Exception e) {
            System.out.println("El elemento no se pudo agregar" + e);
        }
    }

    public void EditarElemento(ListaChicos lista) {
        int elemento;
        boolean encotrado = false;
        System.out.println("Ingrese el codigo del elemento a editar: ");
        Scanner codigo = new Scanner(System.in);
        elemento = Integer.parseInt(codigo.nextLine());
        for (int i = 0; i < lista.chicos.size(); i++) {
            if (lista.chicos.get(i).getCodigo() == elemento) {
                encotrado = true;
                Chico chico = lista.chicos.get(i);
                String MenuC = "**********************************\n"
                        + "*      a. Codigo                 *\n"
                        + "*      b. Sexo                   *\n"
                        + "*      C. Nombre                 *\n"
                        + "*      d. Edad                   *\n"
                        + "*      e. Ciudad                 *\n"
                        + "*      f. Salir                  *\n"
                        + "**********************************\n"
                        + "* Introducir Opcion:             *";
                String entrada = "";
                boolean detener = false;
                while (detener == false) {
                    System.out.print(MenuC);
                    Scanner opcion = new Scanner(System.in);
                    entrada = opcion.nextLine();
                    switch (entrada) {
                        case "a":
                            int codigoEditar;
                            System.out.println("Ingrese el nuevo codigo: ");
                            Scanner newCodigo = new Scanner(System.in);
                            try {
                                codigoEditar = Integer.parseInt(newCodigo.nextLine());
                                chico.setCodigo(codigoEditar);
                                System.out.println("El codigo se ha cambiado correctamente");
                            } catch (Exception e) {
                                System.out.println("El dato no es un numero" + e);
                            }
                            break;
                        case "b":
                            String sexoEditar;
                            System.out.println("Ingrese el nuevo sexo(Masculino o Femenino): ");
                            Scanner newSexo = new Scanner(System.in);
                            sexoEditar = newSexo.nextLine();
                            if (sexoEditar.equals("Masculino") || sexoEditar.equals("Femenino")) {
                                chico.setSexo(sexoEditar);
                                System.out.println("El sexo se ha cambiado correctamente");
                            } else {
                                System.out.println("El sexo ingresado no esta disponible");
                            }
                            break;
                        case "c":
                            String nombreEditar;
                            System.out.println("Ingrese el nuevo nombre: ");
                            Scanner newNombre = new Scanner(System.in);
                            nombreEditar = newNombre.nextLine();
                            chico.setNombre(nombreEditar);
                            System.out.println("El nombre se ha cambiado correctamente");
                            break;
                        case "d":
                            int edadEditar;
                            System.out.println("Ingrese la edad nueva: ");
                            Scanner newEdad = new Scanner(System.in);
                            try {
                                edadEditar = Integer.parseInt(newEdad.nextLine());
                                chico.setEdad(edadEditar);
                                System.out.println("La edad se ha cambiado correctamente");
                            } catch (Exception e) {
                                System.out.println("El dato no es un numero" + e);
                            }
                            break;
                        case "e":
                            String ciudadEditar;
                            System.out.println("1-Bucaramanga\n"
                                    + "2-Giron\n"
                                    + "3-Florida\n"
                                    + "4-Piedecuesta");
                            System.out.println("Ingrese la ciudad a la que desea cambiar: ");
                            Scanner newCiudad = new Scanner(System.in);
                            ciudadEditar = newCiudad.nextLine();
                            if (ciudadEditar.equals("Bucaramanga") || ciudadEditar.equals("Giron")
                                    || ciudadEditar.equals("Florida") || ciudadEditar.equals("Piedecuesta")) {
                                chico.setCiudad(ciudadEditar);
                                System.out.println("La ciudad se ha cambiado correctamente");
                            } else {
                                System.out.println("La ciudad ingresada no esta disponible");
                            }
                            break;
                        case "f":
                            detener = true;
                            break;
                        default:
                            System.out.println("Esta opcion no esta disponible");
                    }
                }
                break;
            }
        }
        if (encotrado == false) {
            System.out.println("El elemento con ese codigo no se ha encontrado");
        }
    }

    public void EliminarElemento(ListaChicos lista) {
        int elemento;
        System.out.println("Ingrese el codigo del elemento a borrar: ");
        Scanner codigo = new Scanner(System.in);
        elemento = Integer.parseInt(codigo.nextLine());
        boolean encotrado = false;
        for (int i = 0; i < lista.chicos.size(); i++) {
            if (lista.chicos.get(i).getCodigo() == elemento) {
                lista.chicos.remove(i);
                encotrado = true;
            }
        }
        if (encotrado == true) {
            System.out.println("El elemento se ha elimidao correctamente");
        } else {
            System.out.println("El elemento con ese codigo no se ha encontrado");
        }
    }
}
