/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_ploblema1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PLOBLEMA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Arreglo generado: [");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()* 10);
            
            System.out.print(arreglo[i] + (i == arreglo.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        
        System.out.print("Ingresa un valor a buscar (0-9): ");
        int valorBuscado = scanner.nextInt();
        
        int contador = 0;
        for (int num : arreglo) {
            if (num == valorBuscado) {
                contador++;
            }
        }
        
        System.out.println("El valor " + valorBuscado + " se repite " + contador + " veces en el arreglo.");
    }
    }
    

