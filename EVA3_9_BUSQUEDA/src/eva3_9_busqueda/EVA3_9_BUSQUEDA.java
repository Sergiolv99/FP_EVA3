/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        boolean encontrar;
        int[] valores = new int[10];
        int valor;
        
        
        for (int i = 0; i < valores.length; i++){
            valores[i] = (int)(Math.random()* 100);
        }
        
        
        for (int i = 0; i < valores.length; i++){
            System.out.println("[" + valores[i] + "]");
            
    }
    do{
        encontrar = false;
        //Pedir el valor
        System.out.println("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO:");
        valor = captu.nextInt();
        
        //Buscar
        //Si esta en el arreglo, salimos de ciclo
        for (int i = 0; i < valores.length; i++){// el valor esta en el arreglo
           if(valor == valores[i]){// El valor
               System.out.println("ENCONTRASTE EL VALOR: ESTA EN LA POSICION "+i);
               encontrar = true;
               break;
               
           } if(encontrar == false){
              System.out.println("EL VALOR NO SE ENCUENTRA EN EL ARREGLO");
          }
        }
        
       
    }while(encontrar ==false);
        
    }
}
