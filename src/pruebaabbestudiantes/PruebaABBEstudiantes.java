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
        Estudiante estudiante1 = Persona.generarEstudiante();
        Estudiante estudiante2 = Persona.generarEstudiante();
        ABBestudiantes abb = new ABBestudiantes();
        for (int i = 0; i < 4; i++) {
            System.out.println(estudiante1);

        }

        System.out.println(abb);

        //compara letras del alfabeto
        String cadena = "a";
        String cadena1 = "b";

        if (cadena.compareTo(cadena1) < 0) {
            System.out.println("Mayor");
        } else if (cadena.compareTo(cadena1) > 0) {
            System.out.println("Menor");
        } else {
            System.out.println("Iguales");
        }
    }
}
