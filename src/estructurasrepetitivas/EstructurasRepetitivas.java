/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author s109e9
 */
public class EstructurasRepetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*********** Estructuras Repetitivas *****************");

        diasDeLaSemana();
        diasDeLaSemana2();
        impresionMatriz();
    }

    /*
     Días de la semana FOR
     */
    public static void diasDeLaSemana() {

        String[] diasSemana = new String[7];
        Scanner scanner = new Scanner(System.in);
        //ingreso de datos
        for (int i = 0; i < diasSemana.length; i++) {
            //ingreso el dia ingresado al vector
            System.out.print("Ingrese el día " + (i + 1) + " de la semana: ");
            String dia = scanner.nextLine();

            System.out.println("Día ingresado: " + dia);
            diasSemana[i] = dia;

        }

        //Impresión de datos
        System.out.println("\n" + "Vector de dias ");
        for (int i = 0; i < diasSemana.length; i++) {

            System.out.println(diasSemana[i]);
        }
    }

    /*
     Días de la semana While
     */
    public static void diasDeLaSemana2() {

        String[] diasSemana = new String[7];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        //ingreso de datos
        while (i < diasSemana.length) {
            //ingreso el dia ingresado al vector
            System.out.print("Ingrese el día " + (i + 1) + " de la semana: ");
            String dia = scanner.nextLine();

            System.out.println("Día ingresado: " + dia);
            diasSemana[i] = dia;
            i = i + 1;
        }

        i = 0;
        //Impresión de datos
        System.out.println("\n" + "Vector de dias ");
        while (i < diasSemana.length) {

            System.out.println(diasSemana[i]);
            i = i + 1;
        }
    }

    /*
     Matriz
     */
    public static void impresionMatriz() {
        int[][] miMatriz = new int[5][4];

        miMatriz[2][2] = 5;

        for (int fila = 0; fila < miMatriz.length; fila++) {
            for (int columna = 0; columna < miMatriz.length-1; columna++) {
                System.out.print(miMatriz[fila][columna]);
            }
             System.out.println();
        }

    }
}
