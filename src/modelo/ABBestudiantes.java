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

    public void imprimir() {
        imprimir(raiz, "");
    }

    private void imprimir(NodoBinario r, String espacios) {
        if (r != null) {
            imprimir(r.HijoDerecho, espacios + "   ");
            System.out.println(espacios + r.estudiante.getNota());
            imprimir(r.HijoIzquierdo, espacios + "   ");
        }
    }

    public boolean agregar(Estudiante estudiante) {
        if (raiz == null) {
            System.out.println("agregado: " + estudiante.getNota());

            raiz = new NodoBinario(estudiante);
            tamanio = 1;
        } else {
            //creamos variable para recorrer el arbol
            NodoBinario recorrer = raiz;

            while (true) {
                if (estudiante.getNUIP().compareTo(recorrer.estudiante.getNUIP()) < 0) {//se decide si es hijoizquiedo o derecho
                    if (recorrer.HijoIzquierdo == null) {// verifica que no tenga hjo izquierdo
                        System.out.println("agregado: " + estudiante.getNota());
                        recorrer.HijoIzquierdo = new NodoBinario(estudiante);//le da un hijo izquierdo
                        tamanio++;// aumenta tamaño del arbol
                        return true;//termina el metodo
                    } else {
                        recorrer = recorrer.HijoIzquierdo;
                    }
                } else if (estudiante.getNUIP().compareTo(recorrer.estudiante.getNUIP()) > 0) {
                    if (recorrer.HijoDerecho == null) {// verifica que tenga hijo derecho
                        System.out.println("agregado: " + estudiante.getNota());
                        recorrer.HijoDerecho = new NodoBinario(estudiante);//le da un hijo derecho
                        tamanio++;// aumenta tamaño del arbol
                        return true;//termina el metodo
                    } else {
                        recorrer = recorrer.HijoDerecho;
                    }
                } else {
                    return false;
                }
            }

        }

        return false;
    }

    public double NotaPromedio() {
        return NotaPromedio(raiz) / tamanio;
    }

    private double NotaPromedio(NodoBinario r) {
        if (r != null) {
            return r.estudiante.getNota() + NotaPromedio(r.HijoDerecho) + NotaPromedio(r.HijoIzquierdo);
        }

        return 0;
    }

    // mayor nota, menor nota,mayor nota mujeres
    public double MayorNota() {
        return MayorNota(raiz, 0);
    }

    private double MayorNota(NodoBinario r, double mayor) {
        if (raiz != null) {
            if (r.estudiante.getNota() > mayor) {
                mayor = r.estudiante.getNota();
                if (r.HijoIzquierdo != null) {
                    return MayorNota(r.HijoIzquierdo, mayor);
                } else if (r.HijoDerecho != null) {
                    return MayorNota(r.HijoDerecho, mayor);
                }
            } else {
                if (r.HijoDerecho != null) {
                    return MayorNota(r.HijoDerecho, mayor);
                } else if (r.HijoIzquierdo != null) {
                    return MayorNota(r.HijoIzquierdo, mayor);
                }

            }
        }
        return mayor;

    }

    public double MenorNota() {
        return MenorNota(raiz, raiz.estudiante.getNota());
    }

    private double MenorNota(NodoBinario r, double Menor) {
        if (r.estudiante.getNota() < Menor) {
            Menor = r.estudiante.getNota();
            if (r.HijoIzquierdo != null) {
                return MenorNota(r.HijoIzquierdo, Menor);
            } else if (r.HijoDerecho != null) {
                return MenorNota(r.HijoDerecho, Menor);
            }
        } else {
            if (r.HijoDerecho != null) {
                return MenorNota(r.HijoDerecho, Menor);
            } else if (r.HijoIzquierdo != null) {
                return MenorNota(r.HijoIzquierdo, Menor);
            }

        }
        return Menor;
    }

    public double MayorNotaMujeres() {
        return MayorNotaMujeres(raiz, 0);
    }

    private double MayorNotaMujeres(NodoBinario r, double mayor) {
        if (r != null && r.estudiante.esMujer()) {
            if (r.estudiante.getNota() > mayor) {
                mayor = r.estudiante.getNota();
                if (r.HijoIzquierdo != null) {
                    return MayorNotaMujeres(r.HijoIzquierdo, mayor);
                } else if (r.HijoDerecho != null) {
                    return MayorNotaMujeres(r.HijoDerecho, mayor);
                }
            } else {
                if (r.HijoDerecho != null) {
                    return MayorNotaMujeres(r.HijoDerecho, mayor);
                } else if (r.HijoIzquierdo != null) {
                    return MayorNotaMujeres(r.HijoIzquierdo, mayor);
                }
            }
        }

        return mayor;
    }

}
