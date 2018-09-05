/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainge2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Ocampo
 */
public class PruebaInge2 {
    
    static void jugar(){
        int flag = 10;
        int[][] matriz = new int[flag][flag];        
        
        for (int i = 0; i<flag; i++){
           for(int j = 0; j < flag; j++){
              matriz[i][j] = i*j;
           }
        }
        
        for (int i = 0; i < flag; i++){		
            for (int j = 0; j < flag; j++){	
                System.out.print(matriz[i][j]+",");
                
            }
            System.out.println("\n");
        }
    }

    static int sumar(int a, int b){
        return a+b;
        
    }
    public static void main(String[] args) {
        System.out.println("Esto es una prueba para ver si sirve esta vara :'v");
        System.out.println("x2");
       int x;
        
        JOptionPane.showMessageDialog(null, "Esto es una prueba");
        
        String algo;
        algo = JOptionPane.showInputDialog("Ingresa algo puto");
        
        System.out.println("TEXTO INGRESADO: "+algo);
        
        System.out.println("MOISO SE COME: "+sumar(9,9)+" PULGADAS");
        
        jugar();
    }

}
