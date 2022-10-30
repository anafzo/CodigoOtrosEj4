//Se crea un paquete llamado com.generation y se guarda dentro el archivo .java
package com.generation;

//Importación de scanner
import java.util.Scanner;

//Se realizó cambio del nombre de la clase para que sea igual al nombre del archivo
public class JuegoGato {

    //Se crea metodo main
    public static void main(String[] args) {
        //Se agregó System.in dentro de los parámetros del constructor de Scanner
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        //Cambio de texto a jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        // Se elimina inicialización de segundo escanner ya que no es necesario
        //Scanner s2 = new Scanner();
        String j2 = s.nextLine();

        //Se eliminó un parentesis dentro del if y se cambia la evaluación por equals ya que son strings
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    //Cambio de evaluación por .equals
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break; //Se agrega break
                case "papel":
                    //Cambio de evaluación por .equals
                    if (j2.equals("piedra")) {
                        g = 1;
                    } //Se agregó una llave
                    break; //Se agrega break
                case "tijeras": //Se agrega una "s" a tijera
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    //Se agrega opción default
                    System.out.println("No válido");
            }
            System.out.println("Gana el jugador " + g);
        }

    }

}
