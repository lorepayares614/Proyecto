/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import java.util.*;

/**
 *
 * @author s109e17
 */
public class Practica2 {
     //reservo espacio en memoria
    public static Contacto contacto = null;
    //declarando un vector de objetos de tipo agenda 
    static Contacto[] agenda;
    static int tamanoAgenda=3;
 
    
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        boolean respuestaCliente = true;
        
        String nomContacto= null;
        long telContacto;
        String correoContacto;
        String opcion;        
        agenda = new Contacto[tamanoAgenda];
        
        while (respuestaCliente) { 
            
            System.out.println();
            System.out.println("		Bienvenido a su agenda telefónica		");
            System.out.println("Ingrese el número de opción");
            System.out.println("A.	Agregar contacto.");
            System.out.println("B.	Buscar contacto.");
            System.out.println("C.	Listar contacto.");
            System.out.println("D.	Estado de la agenda.");
            System.out.println("E.	Ver espacios libres de la agenda.");
            System.out.println("S.	Salir");
            System.out.println("...");
        
            opcion = miScanner.next();
            
                    
            switch (opcion.toUpperCase()){
                case "A":
                    if(espacioLibre() > 0){
                    System.out.println("Ingrese nombre del contacto");
                    nomContacto = miScanner.next();   
                    if (buscarPersona(nomContacto) == false){
                        System.out.println("Ingrese número de telefono del contacto " + nomContacto);
                        telContacto = miScanner.nextLong();
                        System.out.println("Ingrese correo electronico del contacto " + nomContacto);
                        correoContacto = miScanner.next();
                        contacto = new Contacto(nomContacto, telContacto, correoContacto);
                        agregarContacto(contacto);
                        System.out.println("El contacto " + nomContacto + " fue agregado con éxito ");
                        }else{
                        System.out.println("El contacto " + nomContacto + " ya existe, si desea puede ingresar otro contacto ");                    
                        }
                        }
                        else{
                            System.out.println("AGENDA SIN ESPACIO ");                        
                        }
                        break;
                        
                case "B":
                    if(espacioLibre() <= tamanoAgenda-1){
                        System.out.println("Ingrese nombre de contacto que desea buscar ");
                        nomContacto = miScanner.next();                   
                    if(buscarPersona(nomContacto)== true){
                        System.out.println("El contacto " + nomContacto + " existe en la agenda");
                    }else{
                        System.out.println("El contacto NO existe en la agenda");
                    
                    }
                    }else{
                    System.out.println("LA AGENDA NO TIENE CONTACTOS ");
                    }
                    break;
                    
                case "C":
                    if(espacioLibre() == tamanoAgenda){
                        System.out.println("No existen contactos en la agenda ");                    
                    }else{
                        System.out.println("Los contactos de la agenda son: " );
                        listarContacto();
                        
                    
                    }
                    break;
                    
                case "D":
                    if(espacioLibre() == 0){
                        System.out.println("La agenda se encuentra sin espacio libre ");                    
                    }else{
                        System.out.println("La agenda tiene espacio libre ");
                    }
                    break;
                    
                    
                case "E":
                    if(espacioLibre() == 0){
                        System.out.println("La agenda se encuentra sin espacio libre ");                    
                    }else{
                        System.out.println("La agenda tiene " + espacioLibre() + " espacios libres ");
                    }
                    break;      
                    
                    
                case "S": respuestaCliente=false;
                    break;
   
            }   
        }
    }
    // metodo que verifica si hay o no espacio libre, si espacio libre = 0 no puedo incluir contactos porque no hay espacio en la agenda
    //si es mayor a 0 puedo ingresar contacto porque hay espacio en agenda
   private static int espacioLibre(){
    int intCantidadLlenos=0;
	for(int i=0; i < agenda.length; i++){
            if(!(agenda[i] == null)){
                intCantidadLlenos++;
            }
	}
    return tamanoAgenda - intCantidadLlenos;
    }
   
   private static void agregarContacto(Contacto C){    
       for(int j=0; j < agenda.length; j++){
          if(agenda[j] == null){
              agenda[j] = C;
              j = tamanoAgenda;
          }
        }			
    }
   
    private static boolean buscarPersona(String nombre){
        boolean respuesta = false;    
        for (int i=0; i<agenda.length; i++){
        if (!(agenda[i]==null)){  
            if (agenda[i].getNomContacto().equalsIgnoreCase(nombre)){
                respuesta = true;
                i = tamanoAgenda;
            }
        }
    }
    return respuesta;  
    }
    
    private static void listarContacto(){
        for (int i=0; i<agenda.length; i++){
            if (agenda[i] != null){
                System.out.println("El contacto " + (i+1) + " es: " + agenda[i].getNomContacto() + " su número de teléfono es: " + agenda[i].getTelContacto() + " su correo electrónico es: " + agenda[i].getCorreoContacto());            
            }       
        }  
    }   
}
