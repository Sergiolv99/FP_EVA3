/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_ploblema2;

import java.util.Random;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PLOBLEMA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        
        
        System.out.print("Arreglo generado: ");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()* 100);
            System.out.print(arreglo[i] + (i == arreglo.length - 1 ? "" : ", "));
        }
        System.out.println("");
        
        int menor = arreglo[0];
        int mayor = arreglo[0];
        
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        
        System.out.println("El elemento más pequeño es: " + menor);
        System.out.println("El elemento más grande es: " + mayor);
    }
    }
    

