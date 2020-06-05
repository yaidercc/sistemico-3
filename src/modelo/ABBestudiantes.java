/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import edu.oharenas.comun.Estudiante;

/**
 *
 * @author 57314
 */
public class ABBestudiantes {
    private NodoBinario raiz;
    private int tamanio;
    
    public ABBestudiantes(){
        raiz=null;
        tamanio=0;
    }
    public boolean agregar(Estudiante estudiante){
        if(raiz==null){
            raiz= new NodoBinario(estudiante);
            tamanio=1;
        }else{
            //creamos variable para recorrer el arbol
            NodoBinario recorrer=raiz;
            while(true){
                if (estudiante.getNUIP().compareTo(recorrer.getEstudiante().getNUIP())>0) {
                    System.out.println("HOLAAAAA");
                    return true;
                }else{
                    System.out.println("HELLO");
                    return true;
                }
            }
            
            
        }
        
        return false;
    }
}
