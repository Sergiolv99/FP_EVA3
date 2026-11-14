/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_ploblema5;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PLOBLEMA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String[] ciudades = {"Chihuahua", "Juárez", "Delicias", "Parral", "Cuauhtémoc"};
        double[][] temperaturas = new double[5][7];
        
        // Capturar temperaturas
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese las temperaturas de los 7 días para " + ciudades[i] + ":");
            double suma = 0;
            for (int j = 0; j < 7; j++) {
                System.out.print("  Día " + (j + 1) + ": ");
                temperaturas[i][j] = scanner.nextDouble();
                suma += temperaturas[i][j];
            }
            double promedio = suma / 7;
            System.out.println("-> Promedio en " + ciudades[i] + ": " + String.format("%.2f", promedio) + " °C\n");
        }
    }
    }
    

