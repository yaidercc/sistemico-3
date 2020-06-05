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

    public ABBestudiantes() {
        raiz = null;
        tamanio = 0;
    }

    public boolean agregar(Estudiante estudiante) {
        if (raiz == null) {
            raiz = new NodoBinario(estudiante);
            System.out.println("ERES PADRE: " + estudiante);
            tamanio = 1;
        } else {
            //creamos variable para recorrer el arbol
            NodoBinario recorrer = raiz;
            NodoBinario r2 = raiz;
            
            while (true) {
                if (estudiante.getNUIP().compareTo(recorrer.estudiante.getNUIP()) <0) {//se decide si es hijoizquiedo o derecho
                    if (recorrer.HijoIzquierdo == null) {// verifica que no tenga hjo izquierdo
                        recorrer.HijoIzquierdo = new NodoBinario(estudiante);//le da un hijo izquierdo
                        tamanio++;// aumenta tamaño del arbol
                        return true;//termina el metodo
                    } else {
                        r2=recorrer;
                        recorrer = recorrer.HijoIzquierdo;
                    }
                } else if (estudiante.getNUIP().compareTo(recorrer.estudiante.getNUIP()) >0) {
                    if (recorrer.HijoDerecho == null) {// verifica que tenga hijo derecho
                        recorrer = new NodoBinario(estudiante);//le da un hijo derecho
                        tamanio++;// aumenta tamaño del arbol
                        return true;//termina el metodo
                    } else {
                        r2=recorrer;
                        recorrer = recorrer.HijoDerecho;
                    }
                } else {
                    return false;
                }
            }

        }

        return false;
    }
}
