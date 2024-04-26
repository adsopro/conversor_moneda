/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor_moneda;

import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class Conversor_moneda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bievenidos");
            System.out.println("=== Conversor de Moneda Makal ===");
            System.out.println("1. Convertir Peso Colombiano a Dólar");
            System.out.println("2. Convertir Peso Chileno a Dólar");
            System.out.println("3. Convertir Peso Argentino a Dólar");
            System.out.println("4. Convertir Euro a Dólar");
            System.out.println("5. Convertir Real a Dólar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("¡Ha sido un placer, hasta pronto!");
                break;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            double resultado = 0.0;

            switch (opcion) {
                case 1:
                    resultado = convertirPesoColombianoADolar(cantidad);
                    break;
                case 2:
                    resultado = convertirPesoChilenoADolar(cantidad);
                    break;
                case 3:
                    resultado = convertirPesoArgentinoADolar(cantidad);
                    break;
                case 4:
                    resultado = convertirEuroADolar(cantidad);
                    break;
                case 5:
                    resultado = convertirRealADolar(cantidad);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println("El resultado es: " + resultado + " dólares\n");
        }
    }
    
    private static double convertirPesoColombianoADolar(double cantidad) {       
        return cantidad * 0.00027;
    }

    private static double convertirPesoChilenoADolar(double cantidad) {        
        return cantidad * 0.0013;
    }

    private static double convertirPesoArgentinoADolar(double cantidad) {       
        return cantidad * 0.011;
    }

    private static double convertirEuroADolar(double cantidad) {       
        return cantidad * 1.18;
    }

    private static double convertirRealADolar(double cantidad) {        
        return cantidad * 0.19;
    }
}