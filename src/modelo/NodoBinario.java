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
public class NodoBinario {
    Estudiante estudiante;
    NodoBinario HijoIzquierdo;
    NodoBinario HijoDerecho;
    
    public NodoBinario(Estudiante estudiante){
        this.estudiante= estudiante;
        HijoDerecho= null;
        HijoIzquierdo= null;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public NodoBinario getHijoIzquierdo() {
        return HijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoBinario HijoIzquierdo) {
        this.HijoIzquierdo = HijoIzquierdo;
    }

    public NodoBinario getHijoDerecho() {
        return HijoDerecho;
    }

    public void setHijoDerecho(NodoBinario HijoDerecho) {
        this.HijoDerecho = HijoDerecho;
    }
}
