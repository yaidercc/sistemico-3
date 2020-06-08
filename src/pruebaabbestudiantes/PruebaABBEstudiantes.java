/*
 * Copyright (C) 2020 Oscar Arenas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pruebaabbestudiantes;

import edu.oharenas.aleatorio.Persona;
import edu.oharenas.comun.Estudiante;
import modelo.ABBestudiantes;

/**
 *
 * @author Oscar Arenas
 */
public class PruebaABBEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ABBestudiantes abb = new ABBestudiantes();
        Estudiante grupo[] = Persona.generarEstudiante(3);

        for (int i = 0; i < grupo.length; i++) {
            abb.agregar(grupo[i]);
            if (grupo[i].esMujer()) {
                System.out.println("si");

            } else {
                System.out.println("no");

            }
        }
        System.out.println("PROMEDIO: " + abb.NotaPromedio());
        System.out.println(abb);

        System.out.println("mayor en general: " + abb.MayorNota());
        System.out.println("menor en general: " + abb.MenorNota());
        System.out.println("menor mujeres: " + abb.MayorNotaMujeres());

        //compara letras del alfabeto
        /*String cadena = "1";
        String cadena1 = "2";

        if (cadena.compareTo(cadena1) < 0) {
            System.out.println("Mayor");
        } else if (cadena.compareTo(cadena1) > 0) {
            System.out.println("Menor");
        } else {
            System.out.println("Iguales");
        }*/
    }
}
