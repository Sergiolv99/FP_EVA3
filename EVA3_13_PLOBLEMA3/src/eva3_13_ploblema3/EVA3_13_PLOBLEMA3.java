/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_ploblema3;

import java.util.Random;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PLOBLEMA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[5][5];
        
        
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)(Math.random()* 10);
                
            }
        }
        
       
        System.out.println(" Matriz Normal ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("["+ matriz[i][j] + "]");
            }
            System.out.println();
        }
        
        
        System.out.println(" Matriz en Orden Inverso");
        for (int i = 4; i >= 0; i--) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
    
}
