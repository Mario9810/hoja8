
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Morales
 * @author Mario Sarmientos
 */
public class Main {
     
    public static void main(String[] args) {
    ArrayList<String> mensajeTraducido = new ArrayList<String>();
        File f;
        FileReader fr;
	BufferedReader br;
        
        try{
           f = new File("./pacientes.txt");
           fr = new FileReader(f);
           br = new BufferedReader(fr);
           String linea;
           while((linea = br.readLine())!= null){
              linea = linea.replaceAll("[()]", ""); //Para quitar los parentesis de la linea
              String[] datos = linea.split(","); //Para poder separar las palabras
               System.out.println(datos[0]); //datos[0] es el nombre del paciente
               System.out.println(datos[1]);// datos[1] es la enfermedad
               System.out.println(datos[2]);//datos[2] es la prioridad
           }
           br.close();
           fr.close();
          }catch(Exception e){
            System.err.println("Se produjo un error");
        }
}
    
}