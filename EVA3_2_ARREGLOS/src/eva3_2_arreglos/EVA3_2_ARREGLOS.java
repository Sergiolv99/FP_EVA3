/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[], x, y;
        
        arreglo = new int[10];// arreglo con 10 enteros
        //int[] arreglo, x, y;
        // el indice es incorrecto, 10 no es una posicion valida (llega hasta 9)
         
        // EL USO DE ARREGLOS VA LIGADO AL USO DE CICLOS.
        // EN PARTICULAR EL CICLO FOR
        for(int i =0; i<10; i++){
            arreglo[i]= (int)(Math.random()* 100);// casting -- compatibles
        }
        for(int i=0; i<10;i++)
        System.out.println(arreglo[i]+ "-");
    }
    
}
