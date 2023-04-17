/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Perez
 */
public class CSV {

    public static final String separador = ",";

    public static List<Chico> CargarLista() {
        List<Chico> chicos = new ArrayList<>();
        String ruta = "chicos.csv";
        BufferedReader lectura = null;

        try {
            lectura = new BufferedReader(new FileReader(ruta));
            String linea = lectura.readLine();

            while (linea != null) {
                String[] campos = linea.split(separador);
                if (campos[1].equals("F")) {
                    campos[1] = "Femenino";
                } else if (campos[1].equals("M")) {
                    campos[1] = "Masculino";
                }
                if (campos[4].equals("1")) {
                    campos[4] = "Bucaramanga";
                } else if (campos[4].equals("2")) {
                    campos[4] = "Giron";
                } else if (campos[4].equals("3")) {
                    campos[4] = "Florida";
                } else if (campos[4].equals("4")) {
                    campos[4] = "Piedecuesta";
                }
                Chico chico = new Chico(Integer.parseInt(campos[0]), campos[1], campos[2], Integer.parseInt(campos[3]), campos[4]);
                chicos.add(chico);
                linea = lectura.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (lectura != null) {
                try {
                    lectura.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Se ha cargado los siguientes datos:");
        return chicos;
    }

    public static void GuardarCSV(ListaChicos lista) {
        try {
            String ruta = "nuevoChicos.csv";
            File archivo = new File(ruta);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < lista.chicos.size(); i++) {
                bw.write(lista.chicos.get(i).getCodigo() + separador + lista.chicos.get(i).getSexo() + separador
                        + lista.chicos.get(i).getNombre() + separador + lista.chicos.get(i).getEdad() + separador 
                        + lista.chicos.get(i).getCiudad());
                bw.write("\r\n");
            }
            bw.close();
            System.out.println("El archivo se ha creado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Codido:2200172 Nombre:Daniel Mauricio Perez Bolivar Autoevalucaion: 4.8");
    }
}
