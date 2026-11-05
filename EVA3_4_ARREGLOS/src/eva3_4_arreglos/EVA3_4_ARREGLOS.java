/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_arreglos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EVA3_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);
        String[] opciones = {"ventas", "clientes", "proveedores", "salir"};
        
        System.out.println("-----menu del sistema------");
        for(int i = 0; i < opciones.length; i++){
            // CORRECCIÓN 2: Usar corchetes [ ] en lugar de paréntesis ( )
            System.out.println(opciones[i]);
        }
        
    }
    
    
}
