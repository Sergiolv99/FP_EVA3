/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_ploblema4;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PLOBLEMA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        int[][] asistencia = new int[3][5];
        
       
        for (int i = 0; i < 3; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("  Asistencia el " + dias[j] + " (1 para sí, 0 para no): ");
                asistencia[i][j] = scanner.nextInt();
            }
        }
        
   
        System.out.println("Resumen de Asistencias ---");
        for (int i = 0; i < 3; i++) {
            int totalAsistencias = 0;
            int totalInasistencias = 0;
            for (int j = 0; j < 5; j++) {
                if (asistencia[i][j] == 1) {
                    totalAsistencias++;
                } else {
                    totalInasistencias++;
                }
            }
            System.out.println("Estudiante " + (i + 1) + " -> Asistencias: " + totalAsistencias + " | Inasistencias: " + totalInasistencias);
        }
    }
    }
    

